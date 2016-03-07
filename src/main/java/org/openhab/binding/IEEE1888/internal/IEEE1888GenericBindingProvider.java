/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.IEEE1888.internal;

import org.openhab.binding.IEEE1888.IEEE1888BindingProvider;
import org.openhab.core.binding.BindingConfig;
import org.openhab.core.items.Item;
import org.openhab.model.item.binding.AbstractGenericBindingProvider;
import org.openhab.model.item.binding.BindingConfigParseException;


/**
 * <p>
 * Implementation of Binding Provider
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class IEEE1888GenericBindingProvider extends AbstractGenericBindingProvider
	implements IEEE1888BindingProvider {

	@Override
	public String getBindingType() {
		return "ieee1888";
	}

	@Override
	public void validateItemType(Item item, String bindingConfig)
		throws BindingConfigParseException {}

	@Override
	public void processBindingConfiguration(String context, Item item, String bindingConfig)
		throws BindingConfigParseException {
		super.processBindingConfiguration(context, item, bindingConfig);
		IEEE1888BindingConfig config = new IEEE1888BindingConfig();

		addBindingConfig(item, config);
	}

	class IEEE1888BindingConfig implements BindingConfig {
	}
}
