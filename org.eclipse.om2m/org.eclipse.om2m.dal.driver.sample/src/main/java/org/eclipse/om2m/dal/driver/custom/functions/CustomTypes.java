/*******************************************************************************
 * Copyright (c) 2017 Huawei Technologies Co., Ltd (http://www.huawei.com)
 * Huawei Base, Bantian,Longgang District ,Shenzhen ,Guangdong ,China
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Seven Ganlu : Developer
 *
 * New contributors :
 *******************************************************************************/

package org.eclipse.om2m.dal.driver.custom.functions;

import org.osgi.service.dal.functions.Types;

/**
 * Custom function type definition.
 */
public interface CustomTypes extends Types {

	/** Speed control function of fan device */
	public static final String FAN_SPEED = "fanspeed";

	/** Count down */
	public static final String FAN_COUNTDOWN = "fancountdown";

	/** Fault detection function */
	public static final String FAULT_DETECTION = "faultdetection";
}
