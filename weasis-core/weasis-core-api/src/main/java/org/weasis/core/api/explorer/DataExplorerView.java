/*******************************************************************************
 * Copyright (c) 2010 Nicolas Roduit.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 ******************************************************************************/
package org.weasis.core.api.explorer;

import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.weasis.core.api.explorer.model.DataExplorerModel;
import org.weasis.core.api.gui.util.GUIEntry;

public interface DataExplorerView extends PropertyChangeListener, GUIEntry {

    // Must unregister listeners and close model if it not use by other view
    public void dispose();

    public DataExplorerModel getDataExplorerModel();

    public Action getOpenImportDialogAction();

    public Action getOpenExportDialogAction();
}