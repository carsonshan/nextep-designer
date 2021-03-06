/*******************************************************************************
 * Copyright (c) 2011 neXtep Software and contributors.
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
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     neXtep Softwares - initial API and implementation
 *******************************************************************************/
/**
 *
 */
package com.nextep.designer.vcs.gef;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;

/**
 * @author Christophe Fondacci
 *
 */
public class SelectionPolicy extends SelectionEditPolicy {
	private static final Log log = LogFactory.getLog(SelectionPolicy.class);
	/**
	 * @see org.eclipse.gef.editpolicies.SelectionEditPolicy#hideSelection()
	 */
	@Override
	protected void hideSelection() {
		//if(this.getHost() instanceof IDiagramItem) {
//			IDiagramItem i = (IDiagramItem)this.getHost().getModel();
//			IVersionInfo v = (IVersionInfo)i.getItemModel();
			log.debug("Hide selection of model"); // <" +v.getLabel() +">");

		//}
	}

	/**
	 * @see org.eclipse.gef.editpolicies.SelectionEditPolicy#showSelection()
	 */
	@Override
	protected void showSelection() {
		//if(this.getHost() instanceof IDiagramItem) {
//			IDiagramItem i = (IDiagramItem)this.getHost().getModel();
//			IVersionInfo v = (IVersionInfo)i.getItemModel();
			log.debug("Show selection of model <"); // +v.getLabel() +">");

		//}

	}

}
