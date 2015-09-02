/*
 * CashDocumentModelInServiceBean.java
 *
 * Copyright (c) 1998 - 2004 BusinessTechnology, Ltd.
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

package com.mg.merp.account.support;

import javax.ejb.Stateless;

import com.mg.merp.account.CashDocumentInServiceLocal;
import com.mg.merp.account.CashDocumentModelInServiceLocal;
import com.mg.merp.account.model.CashDocumentModel;
import com.mg.merp.document.generic.DocumentModelServiceBean;

/**
 * ������-��������� "������� ��������� �������� �������" 
 * 
 * @author leonova
 * @version $Id: CashDocumentModelInServiceBean.java,v 1.3 2006/09/12 11:16:43 leonova Exp $
 */
@Stateless(name="merp/account/CashDocumentModelInService")
public class CashDocumentModelInServiceBean extends DocumentModelServiceBean<CashDocumentModel, Integer> implements CashDocumentModelInServiceLocal {

	/* (non-Javadoc)
	 * @see com.mg.merp.document.generic.DocumentModelServiceBean#getDocSectionIdentifier()
	 */
	@Override
	protected short getDocSectionIdentifier() {
		return CashDocumentInServiceLocal.DOCSECTION;
	}



}