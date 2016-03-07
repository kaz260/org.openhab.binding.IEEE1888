/**
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.IEEE1888.trap;

import org.fiap.types.Point;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Trap Information
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class TrapInfo {
	/**
	 * target point
	 */
	private Point point;

	/**
	 * callback URL<br>
	 * Key:URL、Value:date
	 */
	private Map<String, Date> callbackURLMap = new HashMap<>();

	/**
	 * get target point
	 *
	 * @return point
	 */
	public Point getPoint() {
		return this.point;
	}

	/**
	 * set target point
	 *
	 * @param pointId point
	 */
	public void setPoint(Point point) {
		this.point = point;
	}

	/**
	 * get callback URL
	 *
	 * @return callbackURLMap
	 */
	public Map<String, Date> getCallbackURLMap() {
		return this.callbackURLMap;
	}

	/**
	 * set callbackURLMap
	 *
	 * @param callbackURLMap
	 */
	public void setCallbackURLMap(Map<String, Date> callbackURLMap) {
		this.callbackURLMap = callbackURLMap;
	}

	@Override
	public String toString() {
		return "TrapInfo [point=" + point.toString() + ", callbackURLMap=" + callbackURLMap
				  + "]";
	}
}
