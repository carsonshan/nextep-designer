/*******************************************************************************
 * Copyright (c) 2013 neXtep Software and contributors.
 * All rights reserved.
 *
 * This file is part of neXtep designer.
 *
 * NeXtep designer is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or any later version.
 *
 * NeXtep designer is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with neXtep designer.  
 * If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     neXtep Softwares - initial API and implementation
 *******************************************************************************/
package com.nextep.designer.dbgm.postgre.model;

import com.nextep.datadesigner.model.ITypedObject;

/**
 * A little interface defined to bind the parent table of an inheritance with
 * the inherited table. It is only used by UI editors.
 * 
 * @author Christophe Fondacci
 */
public interface IPostgreSqlInheritedTable extends ITypedObject {

	String TYPE_ID = "INHERITED_TABLE"; //$NON-NLS-1$

	IPostgreSqlTable getParent();

	IPostgreSqlTable getTable();

	void setParent(IPostgreSqlTable parent);

	void setTable(IPostgreSqlTable table);
}
