/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.IEEE1888.server;

import org.apache.axis2.databinding.types.URI;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.fiap.server.FIAPServerInterface;
import org.fiap.soap.DataRQ;
import org.fiap.soap.DataRS;
import org.fiap.soap.QueryRQ;
import org.fiap.soap.QueryRS;
import org.fiap.types.Body;
import org.fiap.types.Error;
import org.fiap.types.Header;
import org.fiap.types.Key;
import org.fiap.types.OK;
import org.fiap.types.Point;
import org.fiap.types.PointSet;
import org.fiap.types.Query;
import org.fiap.types.Transport;
import org.fiap.types.TrapType;
import org.fiap.types.Value;
import org.openhab.binding.IEEE1888.internal.IEEE1888Binding;
import org.openhab.binding.IEEE1888.trap.TrapManager;
import org.openhab.core.items.Item;
import org.openhab.core.items.ItemNotFoundException;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.TypeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * IEEE1888 WebService Server
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class FIAPServer implements FIAPServerInterface {
	/**
	 * logger 
	 */
	private static final Logger logger = LoggerFactory.getLogger(IEEE1888Binding.class);
	private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
	private static final Pattern STATE_CONFIG_PATTERN = Pattern
		.compile("(.*?)\\=(.*?)\\&(.*?)\\=(.*?)");

	public QueryRS query(QueryRQ queryRQ) {
		try {
			Query query = queryRQ.getTransport().getHeader().getQuery();
			URI callbackData = query.getCallbackData();

			Key[] keys = query.getKey();

			Body body = new Body();
			if (ArrayUtils.isNotEmpty(keys)) {
				for (Key key : keys) {
					if (!("time".equals(key.getAttrName()) && "maximum".equals(key.getSelect()))) {
						Error error = new Error();
						error.setString("query for past data is not supported.");
						error.setType("QUERY_NOT_SUPPORTED");
						return buildQueryRS(null, null, error);
					}

					URI id = key.getId();
					String itemName = buildItemName(id);
					Item item = IEEE1888Binding.getItemRegistry().getItem(itemName);
					String stateStr = item.getState().toString();

					if (item != null) {
						String value = item.getState().toString();
						// create point value
						Point point = buidPoint(id, value);
						body.addPoint(point);

						// trap
						if (key.getTrap() == TrapType.changed && callbackData != null) {
							TrapManager.addTrap(itemName, point, callbackData.toString());
						}

						State state = TypeParser.parseState(item.getAcceptedDataTypes(), stateStr);
						IEEE1888Binding.getEventPublisher().postUpdate(itemName, state);
						logger.debug("state from FIAP service Binding: " + "itemName : "
							+ itemName + " state : " + state.toString());
					}
				}
			}
			return buildQueryRS(query, body, null);

		} catch (Exception e) {
			Error error = new Error();
			error.setString(e.getMessage());
			error.setType("SERVER_ERROR");
			return buildQueryRS(null, null, error);
		}
	}

	private Point buidPoint(URI id, String valueStr) throws ParseException {
		// analyze value
		HashMap<String, String> keyValueMap = new HashMap<>();
		if (valueStr != null) {
			String[] values = StringUtils.split(valueStr, "&");
			if (values != null) {
				for (String value : values) {
					keyValueMap.put(StringUtils.substringBefore(value, "="),
						StringUtils.substringAfter(value, "="));
				}
			}
		}
		// [point]
		Point point = new Point();
		point.setId(id);

		Value value = new Value();
		// [time]
		Calendar timeValue = Calendar.getInstance();
		if (StringUtils.isNotBlank(keyValueMap.get("time"))) {
			Date dateTime = DateUtils.parseDate(keyValueMap.get("time"), TIME_FORMAT);
			timeValue.setTime(dateTime);
		}
		value.setTime(timeValue);

		// [value]
		String v;
		if (keyValueMap.containsKey("value")) {
			v = keyValueMap.get("value");
		} else {
			v = valueStr;
		}
		if (v == null) {
			v = "";
		}
		value.setString(v);

		point.addValue(value);
		return point;
	}

	private QueryRS buildQueryRS(Query query, Body body, Error error) {
		QueryRS queryRS = new QueryRS();
		// header
		Header header = new Header();
		if (error != null) {
			header.setError(error);
		} else {
			header.setOK(new OK());
			header.setQuery(query);
		}

		// Transport
		Transport transport = new Transport();
		transport.setHeader(header);

		if (error == null) {
			transport.setBody(body);
		}

		queryRS.setTransport(transport);
		return queryRS;
	}

	public DataRS data(DataRQ dataRQ) {
		try {
			// [point]
			Point[] points = dataRQ.getTransport().getBody().getPoint();
			sendPointsData(points);

			// [point set]
			PointSet[] pointSets = dataRQ.getTransport().getBody().getPointSet();
			sendPointSetsData(pointSets);

			// return OK
			return buildDataRS(null);
		} catch (Exception e) {
			Error error = new Error();
			error.setString(StringUtils.defaultString(e.getMessage()));
			error.setType("SERVER_ERROR");
			return buildDataRS(error);
		}
	}

	private void sendPointSetsData(PointSet[] pointSets) throws ItemNotFoundException {
		if (ArrayUtils.isEmpty(pointSets)) {
			return;
		}
		for (PointSet pointSet : pointSets) {
			sendPointsData(pointSet.getPoint());
			PointSet[] subPointSets = pointSet.getPointSet();
			if (ArrayUtils.isNotEmpty(subPointSets)) {
				sendPointSetsData(subPointSets);
			}
		}
	}

	private void sendPointsData(Point[] points) throws ItemNotFoundException {
		if (ArrayUtils.isNotEmpty(points)) {
			for (Point point : points) {
				// [value]
				Value[] value = point.getValue();
				if (ArrayUtils.isEmpty(value)) {
					continue;
				}

				String itemName = buildItemName(point.getId());

				for (Value v : value) {
					String valueStr = v.getString();
					Calendar valueTime = v.getTime();
					Item item = IEEE1888Binding.getItemRegistry().getItem(itemName);
					String oldItemValue = item.getState().toString();

					// send command
					String valueTimeStr = DateFormatUtils.format(valueTime, TIME_FORMAT);

					List<String> buildCmd = new ArrayList<>();
					buildCmd.add("time=" + valueTimeStr);
					buildCmd.add("value=" + valueStr);
					String cmdStr = StringUtils.join(buildCmd, "&");

					Command cmd = TypeParser.parseCommand(item.getAcceptedCommandTypes(), cmdStr);
					if (cmd != null) {
						IEEE1888Binding.getEventPublisher().postCommand(itemName, cmd);
						logger.debug("command from FIAP service Binding: \n" + "itemName : " + itemName
							+ "\n cmd : " + cmd.toString());
					}

					if (oldItemValue != null) {
						// analyze state
						Matcher matcher = STATE_CONFIG_PATTERN.matcher(oldItemValue);
						// update state
						if (matcher.find()) {
							valueStr = cmdStr;
						}
					}
					State state = TypeParser.parseState(item.getAcceptedDataTypes(), valueStr);
					// following five lines may not be needed.
					if (state != null) {
						IEEE1888Binding.getEventPublisher().postUpdate(itemName, state);
						logger.debug("state from FIAP service Binding: \n" + "itemName : "
							+ itemName + "\n cmd : " + state.toString());
					}
				}
			}
		}
	}

	private String buildItemName(URI id) {
		String host = id.getHost();
		String path = id.getPath();

		if (StringUtils.isBlank(host)) {
			host = id.getRegBasedAuthority();
		}

		List<String> subNameList = new ArrayList<>();

		subNameList.add(host);

		if (StringUtils.isNotBlank(path)) {
			subNameList.addAll(Arrays.asList(StringUtils.split(path, "/")));
		}

		return StringUtils.join(subNameList, "_");
	}

	private DataRS buildDataRS(Error error) {
		DataRS dataRS = new DataRS();
		// header
		Header header = new Header();
		if (error != null) {
			header.setError(error);
		} else {
			header.setOK(new OK());
		}
		// Transport
		Transport transport = new Transport();
		transport.setHeader(header);

		dataRS.setTransport(transport);
		return dataRS;
	}
}
