/*
 * TripleSumSign.java
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
package com.mg.merp.salary.model;

import com.mg.framework.api.annotations.EnumConstantText;

/**
 * ���� ���������/���������
 * 
 * @author leonova
 * @version $Id: TripleSumSign.java,v 1.1 2006/03/30 11:31:37 safonov Exp $
 */
public enum TripleSumSign {
	/**
	 * �� ������
	 */
	@EnumConstantText ("resource://com.mg.merp.salary.resources.dataitemlabels#TripleSumSign.None")
	NONE,

	/**
	 * ����
	 */
	@EnumConstantText ("resource://com.mg.merp.salary.resources.dataitemlabels#TripleSumSign.Plus")
	Plus,
	
	/**
	 * �����
	 */
	@EnumConstantText ("resource://com.mg.merp.salary.resources.dataitemlabels#TripleSumSign.Minus")
	Minus
}
