/*
 * TariffingScaleType.java
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
package com.mg.merp.personnelref.model;

import com.mg.framework.api.annotations.EnumConstantText;

/**
 * ��� �������� �����
 * 
 * @author leonova
 * @version $Id: TariffingScaleType.java,v 1.1 2006/04/13 10:23:53 safonov Exp $
 */
public enum TariffingScaleType {
	/**
	 * ����� ���������
	 */
	@EnumConstantText("resource://com.mg.merp.personnelref.resources.dataitemlabels#TariffingScaleType.Monthly")
	MONTHLY,
	
	/**
	 * ������ �� ����
	 */
	@EnumConstantText("resource://com.mg.merp.personnelref.resources.dataitemlabels#TariffingScaleType.ScaleDay")
	SCALEDAY,	
	
	/**
	 * ������ �� ���
	 */
	@EnumConstantText("resource://com.mg.merp.personnelref.resources.dataitemlabels#TariffingScaleType.ScaleHour")
	SCALEHOUR,

	/**
	 * �� ����� �����
	 */
	@EnumConstantText("resource://com.mg.merp.personnelref.resources.dataitemlabels#TariffingScaleType.VolumeWork")
	VOLUMEWORK

}
