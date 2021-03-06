/*
 * DefaultMaintenancePane.java
 *
 * Copyright (c) 1998 - 2006 BusinessTechnology, Ltd.
 * All rights reserved
 *
 * This program is the proprietary and confidential information
 * of BusinessTechnology, Ltd. and may be used and disclosed only
 * as authorized in a license agreement authorizing and
 * controlling such use and disclosure
 *
 * Millennium Business Suite Anywhere System.
 *
 */
package com.mg.framework.api.ui.widget;

import com.mg.framework.api.ui.Container;

/**
 * ������� "�������� ������������ ���� ��������� ������-�����������"
 * 
 * @author Oleg V. Safonov
 * @version $Id: DefaultMaintenancePane.java,v 1.1 2006/11/21 15:34:06 safonov Exp $
 */
public interface DefaultMaintenancePane extends Container {
	/**
	 * ������� ����������� �� ��������� �������� �� ��� �� ������, ��� � ����������,
	 * ����� ��� <code>Boolean</code>
	 */
	final static String SAME_LINE = "sameLine";
	
	/**
	 * ������� �����������, ��� ������ ���� ����� ��������� �� ��� ������ �����,
	 * ����� ��� <code>Boolean</code>
	 */
	final static String LONG_FIELD = "longField";
	
	/**
	 * ������� ������ �����, ��� ���� ������� � �������� ����� �������� �� ���������� �����,
	 * ����� ��� <code>String</code>
	 */
	final static String FIELD_GROUP = "fieldGroup";

}
