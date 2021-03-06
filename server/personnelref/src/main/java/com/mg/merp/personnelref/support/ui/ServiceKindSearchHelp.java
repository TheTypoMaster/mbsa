/*
 * ServiceKindSearchHelp.java
 *
 * Copyright (c) 1998 - 2006 BusinessTechnology, Ltd.
 * All rights reserved
 *
 * This program is the proprietary and confidential information
 * of BusinessTechnology, Ltd. and may be used and disclosed only
 * as authorized in a license agreement authorizing and
 * controlling such use and disclosure
 *
 * Millennium ERP system.
 *
 */
package com.mg.merp.personnelref.support.ui;

import com.mg.framework.generic.ui.DefaultLegacySearchHelp;

/**
 * @author Julia 'Jetta' Konyashkina
 * @version $Id: ServiceKindSearchHelp.java,v 1.2 2006/07/12 06:20:24 leonova Exp $
 */
public class ServiceKindSearchHelp extends DefaultLegacySearchHelp {

	@Override
	protected String getServiceName() {
		return "merp/personnelref/ServiceKind";
	}

}
