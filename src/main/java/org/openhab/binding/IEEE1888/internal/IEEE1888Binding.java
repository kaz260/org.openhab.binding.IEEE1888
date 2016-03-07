/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.IEEE1888.internal;

import org.apache.commons.lang3.StringUtils;
import org.openhab.binding.IEEE1888.IEEE1888BindingProvider;
import org.openhab.binding.IEEE1888.trap.TrapManager;
import org.openhab.core.binding.AbstractActiveBinding;
import org.openhab.core.events.EventPublisher;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.types.State;
import org.openhab.model.item.binding.AbstractGenericBindingProvider;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;
import java.util.Dictionary;
import java.util.Timer;
import java.util.TimerTask;


/**
 * <p>
 * Bingind
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class IEEE1888Binding extends AbstractActiveBinding<IEEE1888BindingProvider>
	implements ManagedService {

	/**
	 * logger 
	 */
	private static final Logger logger = LoggerFactory.getLogger(IEEE1888Binding.class);

	/**
	 * event publisher
	 */
	private static EventPublisher eventPublisher;

	/**
	 * item registry
	 */
	private static ItemRegistry itemRegistry;

	/**
	 * binding providor 
	 */
	private static AbstractGenericBindingProvider bindingProvider;


	private Timer removeTimeoutTrapTimer;

	@Override
	protected long getRefreshInterval() {
		return Long.MAX_VALUE;
	}

	@Override
	protected String getName() {
		return "IEEE1888 Refresh Service";
	}

	/**
	 * deactivate 
	 */
	public void deactivate() {
		if (removeTimeoutTrapTimer != null) {
			removeTimeoutTrapTimer.cancel();
		}
		super.deactivate();
		logger.debug("IEEE1888 binding deactivated");
	}

	/**
	 * @{inheritDoc
	 */
	@Override
	protected void execute() {
		// do nothing
		logger.debug("execute() method is called!");
	}

	@Override
	protected void internalReceiveUpdate(String itemName, State newState) {
		logger.debug("internalReceiveUpdate({},{}) is called!", itemName, newState);
		// trap
		try {
			TrapManager.putTrapData(itemName, newState);
		} catch (ParseException e) {
			logger.error(itemName + ":fail to send trap", e);
		}
	}

	@Override
	public void updated(Dictionary<String, ?> configuration) throws ConfigurationException {
		if (removeTimeoutTrapTimer != null) {
			removeTimeoutTrapTimer.cancel();
		}
		// Trap timeout
		String trapTimeOutString = (String) configuration.get("trapTimeOut");
		if (StringUtils.isNotBlank(trapTimeOutString)) {
			long trapTimeOut = Long.parseLong(trapTimeOutString);
			removeTimeoutTrapTimer = new Timer();
			removeTimeoutTrapTimer.schedule(new TimerTask() {
				@Override
				public void run() {
					TrapManager.removeTimeoutTrap(trapTimeOut);
				}
			}, new Date(), 10 * 1000);
		}
	}

	/**
	 * set event registry
	 *
	 * @param itemRegistry 
	 */
	public void setEventPublisher(EventPublisher eventPublisher) {
		IEEE1888Binding.eventPublisher = eventPublisher;
	}

	/**
	 * unset event registry
	 *
	 * @param itemRegistry
	 */
	public void unsetEventPublisher(EventPublisher eventPublisher) {
		IEEE1888Binding.eventPublisher = null;
	}

	/**
	 * get event publisher
	 *
	 * @return eventPublisher 
	 */
	public static EventPublisher getEventPublisher() {
		return eventPublisher;
	}

	/**
	 * set Item registry
	 *
	 * @param itemRegistry
	 */
	public void setItemRegistry(ItemRegistry itemRegistry) {
		IEEE1888Binding.itemRegistry = itemRegistry;
	}

	/**
	 * unset Item registry
	 *
	 * @param itemRegistry
	 */
	public void unsetItemRegistry(ItemRegistry itemRegistry) {
		IEEE1888Binding.itemRegistry = null;
	}

	/**
	 * get Item registry
	 *
	 * @return ItemRegistry
	 */
	public static ItemRegistry getItemRegistry() {
		return IEEE1888Binding.itemRegistry;
	}

	/**
	 * set binding provider
	 *
	 * @param bindingProvider
	 */
	public void setBindingProvider(AbstractGenericBindingProvider bindingProvider) {
		IEEE1888Binding.bindingProvider = bindingProvider;
	}

	/**
	 * unset binding provider
	 *
	 * @param bindingProvider
	 */
	public void unsetBindingProvider(AbstractGenericBindingProvider bindingProvider) {
		IEEE1888Binding.bindingProvider = null;
	}

	/**
	 * get binding provider
	 *
	 * @return bindingProvidor
	 */
	public static AbstractGenericBindingProvider getBindingProvider() {
		return IEEE1888Binding.bindingProvider;
	}
}
