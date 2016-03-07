/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.IEEE1888.trap;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.fiap.server.FIAPServerStub;
import org.fiap.soap.DataRQ;
import org.fiap.soap.DataRS;
import org.fiap.types.Body;
import org.fiap.types.Error;
import org.fiap.types.Header;
import org.fiap.types.OK;
import org.fiap.types.Point;
import org.fiap.types.Transport;
import org.fiap.types.Value;
import org.openhab.binding.IEEE1888.internal.IEEE1888Binding;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * Trap Manager class
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class TrapManager {
	/**
	 * Logger 
	 */
	private static final Logger logger = LoggerFactory.getLogger(TrapManager.class);
	
	/**
	 * format of time stamp
	 */
	private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

	/**
	 * trap information
	 */
	private static Map<String, TrapInfo> trapMap = new HashMap<>();

	/**
	 * remove timeouted trap
	 *
	 * @param trapTimeOut
	 */
	public static void removeTimeoutTrap(long trapTimeOut) {
		final long currentTimeMillis = System.currentTimeMillis();
		synchronized (trapMap) {
			Iterator<Entry<String, TrapInfo>> trapIt = trapMap.entrySet().iterator();
			while (trapIt.hasNext()) {
				Entry<String, TrapInfo> trapEntry = trapIt.next();

				TrapInfo trapInfo = trapEntry.getValue();

				Map<String, Date> callbackURLMap = trapInfo.getCallbackURLMap();
				Iterator<Entry<String, Date>> it = callbackURLMap.entrySet().iterator();
				while (it.hasNext()) {
					Entry<String, Date> entry = it.next();
					Date value = entry.getValue();
					if ((currentTimeMillis - value.getTime()) >= trapTimeOut) {
						// remove timeouted URL
						it.remove();

						logger.info("remove Trap URL Trap information=[{}]、URL=[{}]、date=[{}]", trapInfo,
							entry.getKey(), value);
					}
				}

				if (callbackURLMap.size() == 0) {
					// If all URL were removed, trap informations were also removed.
					trapIt.remove();

					// remove listener
					IEEE1888Binding.getBindingProvider().removeConfigurations(trapEntry.getKey());

					logger.info("remove Trap information. Trap information=[{}]", trapInfo);
				}
			}
		}
	}

	/**
	 * add Trap request
	 *
	 * @param itemName
	 * @param point
	 * @param callBackUrl
	 * @throws Exception
	 */
	public static void addTrap(String itemName, Point point,
		String callBackUrl) throws Exception {
		synchronized (trapMap) {
			if (!trapMap.containsKey(itemName)) {
				trapMap.put(itemName, new TrapInfo());
			}
			
			TrapInfo trapInfo = trapMap.get(itemName);
			trapInfo.setPoint(point);
			trapInfo.getCallbackURLMap().put(callBackUrl, new Date());

			// add listener
			IEEE1888Binding.getBindingProvider().processBindingConfiguration(itemName,
				IEEE1888Binding.getItemRegistry().getItem(itemName), null);


			logger.info("add Trap information. Item=[{}]、callbackURL=[{}]", itemName, callBackUrl);
		}
	}

	/**
	 * If there are any updates, data were sened.
	 *
	 * @param itemName
	 * @param newState
	 */
	public static void putTrapData(String itemName, State newState) throws ParseException{
		if (!trapMap.containsKey(itemName)) {
			// If there is not trap, trap is never processed.
			return;
		}
		
		TrapInfo trapInfo = trapMap.get(itemName);
		Value pointValue = trapInfo.getPoint().getValue()[0];
		String newValue = newState.toString();
		
		Pattern STATE_CONFIG_PATTERN = Pattern
				.compile("(.*?)\\=(.*?)\\&(.*?)\\=(.*?)");
		// analyze state
		Matcher matcher = STATE_CONFIG_PATTERN.matcher(newValue);
		if (matcher.find()) {
			String[] values = StringUtils.split(newValue, "&");
			HashMap<String, String> keyValueMap = new HashMap<>();
			for (String value : values) {
				keyValueMap.put(StringUtils.substringBefore(value, "="),
					StringUtils.substringAfter(value, "="));
			}
			
			Calendar timeValue = Calendar.getInstance();
			if (StringUtils.isNotBlank(keyValueMap.get("time"))) {
				Date dateTime = DateUtils.parseDate(keyValueMap.get("time"), TIME_FORMAT);
				timeValue.setTime(dateTime);
			}
			
			if ((timeValue.compareTo(pointValue.getTime()) == 0)
					&& StringUtils.equals(keyValueMap.get("value"), pointValue.getString())) {
				// If state was not changed, trap is not processed.
				return;
			}
			pointValue.setString(keyValueMap.get("value"));
			pointValue.setTime(timeValue);
		} else {
			if (StringUtils.equals(newValue, pointValue.getString())) {
				// If state was not changed, trap is not processed.
				return;
			}
			pointValue.setString(newValue);
			pointValue.setTime(Calendar.getInstance());
		}
		
		// send data
		Map<String, Date> CallbackURLMap = trapInfo.getCallbackURLMap();
		CallbackURLMap.keySet().forEach(key -> new Thread(() -> {
			sendData(key, trapInfo);
		}).start());
	}


	/**
	 * sendData
	 *
	 * @param serverUrl
	 * @param trapInfo
	 */
	private static void sendData(String serverUrl, TrapInfo trapInfo) {
		String sendInfo = MessageFormat.format("URL=[{0}]、Trap information=[{1}]", serverUrl, trapInfo);

		try {
			FIAPServerStub server = new FIAPServerStub(serverUrl);

			DataRQ dataRQ = new DataRQ();

			// [transport]
			Transport transport = new Transport();
			dataRQ.setTransport(transport);

			// [body]
			Body body = new Body();
			transport.setBody(body);

			// [point]
			Point point = trapInfo.getPoint();
			body.addPoint(point);

			DataRS dataRS = server.data(dataRQ);

			/* get transport object from dataRS */
			transport = dataRS.getTransport();

			/* get header object from Transport object */
			Header header = transport.getHeader();

			if (header == null) {
				logger.error("fail to send Trap.{}, errror=[Header object was not found.]", sendInfo);
				return;
			}

			/* get OK or Error objecdt from header object. */
			OK ok = header.getOK();
			if (ok != null) {
				/* OK */
				logger.info("Success to send Trap.{}", sendInfo);
			} else {
				/* Error */
				Error error = header.getError();
				if (error != null) {
					logger.error("fail to send Trap.{}, Error=[Error: type=\'{}\'; message=\'{}\']",
						sendInfo, error.getType(), error.getString());
				} else {
					logger.error(
						"fail to send Trap.{}, Error=[Neither OK nor Error object was not found.]", sendInfo);
				}
			}
		} catch (Exception e) {
			logger.error(MessageFormat.format("fail to send Trap.{0}", sendInfo), e);
		}
	}
}
