/*
 * CostsAnl3SearchHelp.java
 *
 * Copyright (c) 1998 - 2007 BusinessTechnology, Ltd.
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
package com.mg.merp.personnelref.support.ui;

/**
 * ��������� ��������� "��������� ������� ������ 3-�� ������"
 * 
 * @author Artem V. Sharapov
 * @version $Id: CostsAnl3SearchHelp.java,v 1.1 2007/07/09 08:07:46 sharapov Exp $
 */
public class CostsAnl3SearchHelp extends CostsAnlSearchHelp {

	private final short analiticsLevel = 3;
	

	/* (non-Javadoc)
	 * @see com.mg.merp.personnelref.support.ui.CostsAnlSearchHelp#getAnaliticsLevel()
	 */
	@Override
	short getAnaliticsLevel() {
		return analiticsLevel;
	}
	
}
