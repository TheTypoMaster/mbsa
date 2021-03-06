/*
 * TransactHeadServiceBean.java
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

package com.mg.merp.paymentalloc.support;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;

import com.mg.framework.generic.AbstractPOJODataBusinessObjectServiceBean;
import com.mg.merp.paymentalloc.TransactHeadServiceLocal;
import com.mg.merp.paymentalloc.model.TransactHead;

/**
 * ���������� ������-���������� "��������� ���������" 
 * 
 * @author leonova
 * @author Artem V. Sharapov
 * @version $Id: TransactHeadServiceBean.java,v 1.4 2007/07/31 06:21:17 sharapov Exp $
 */
@Stateless(name="merp/paymentalloc/TransactHeadService") //$NON-NLS-1$
@PermitAll
public class TransactHeadServiceBean extends AbstractPOJODataBusinessObjectServiceBean<TransactHead, Integer> implements TransactHeadServiceLocal {

}
