/*
 * DeductionKindBr.java
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
package com.mg.merp.personnelref.support.ui;

import java.util.Set;

import com.mg.framework.generic.ui.DefaultMaintenanceEJBQLTableModel;
import com.mg.framework.generic.ui.DefaultPlainBrowseForm;
import com.mg.framework.support.ui.widget.MaintenanceTableModel;
import com.mg.framework.support.ui.widget.TableEJBQLFieldDef;
import com.mg.framework.utils.DatabaseUtils;
import com.mg.merp.personnelref.model.DeductionKind;

/**
 * ������� ����� �������
 * 
 * @author leonova
 * @version $Id: DeductionKindBr.java,v 1.1 2006/09/04 13:05:19 leonova Exp $ 
 */
public class DeductionKindBr extends DefaultPlainBrowseForm {
	private final String INIT_QUERY_TEXT = "select %s from DeductionKind dk";
	
	@Override
	protected String createQueryText() {
		Set<TableEJBQLFieldDef> fieldDefs = ((DefaultMaintenanceEJBQLTableModel) table.getModel()).getFieldDefsSet();
		String fieldsList = DatabaseUtils.generateEJBQLSelectClause(fieldDefs);			
		
		return String.format(INIT_QUERY_TEXT, fieldsList);				

	}

	@Override
	protected MaintenanceTableModel createModel() {
		return new DefaultMaintenanceEJBQLTableModel() {

			/* (non-Javadoc)
			 * @see com.mg.framework.generic.ui.DefaultEJBQLTableModel#getDefaultFieldDefsSet()
			 */
			@Override
			protected Set<TableEJBQLFieldDef> getDefaultFieldDefsSet() {
				Set<TableEJBQLFieldDef> result = super.getDefaultFieldDefsSet();
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "Id", "dk.Id", true));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "DCode", "dk.DCode", false));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "DName", "dk.DName", false));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "BeginDate", "dk.BeginDate", false));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "DeductionClass", "dk.DeductionClass", false));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "MinSalaryNumber", "dk.MinSalaryNumber", false));
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "MaxIncome", "dk.MaxIncome", false));	
				result.add(new TableEJBQLFieldDef(DeductionKind.class, "FixedSum", "dk.FixedSum", false));				
				return DatabaseUtils.embedAddinFieldsDefaultEJBQLFieldDefs(result, service);

			}

			/* (non-Javadoc)
			 * @see com.mg.framework.generic.ui.AbstractTableModel#doLoad()
			 */
			@Override
			protected void doLoad() {
				setQuery(createQueryText());
			}

			/* (non-Javadoc)
			 * @see com.mg.framework.generic.ui.DefaultMaintenanceEJBQLTableModel#getPrimaryKeyFieldIndex()
			 */
			@Override
			protected int getPrimaryKeyFieldIndex() {
				return 0;
			}
			
		};

	}

}