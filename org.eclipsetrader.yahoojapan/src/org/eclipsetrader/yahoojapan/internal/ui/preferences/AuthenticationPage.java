/*
 * Copyright (c) 2004-2011 Marco Maccaferri and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Marco Maccaferri - initial API and implementation
 *     Naofumi Fukue - Yahoo! JAPAN Connector
 */

package org.eclipsetrader.yahoojapan.internal.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipsetrader.yahoojapan.internal.YahooJapanActivator;
import org.eclipsetrader.yahoojapan.internal.core.connector.SnapshotConnector;

public class AuthenticationPage extends PreferencePage implements IWorkbenchPreferencePage {

    private Combo driver;

    public AuthenticationPage() {
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    @Override
    public void init(IWorkbench workbench) {
        setPreferenceStore(YahooJapanActivator.getDefault().getPreferenceStore());
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createContents(Composite parent) {
        Composite content = new Composite(parent, SWT.NONE);
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        gridLayout.marginWidth = gridLayout.marginHeight = 0;
        content.setLayout(gridLayout);

        Label label = new Label(content, SWT.NONE);
        label.setText(Messages.AuthenticationPage_Driver);
        label.setLayoutData(new GridData(convertHorizontalDLUsToPixels(80), SWT.DEFAULT));
        driver = new Combo(content, SWT.READ_ONLY);
        driver.add(Messages.AuthenticationPage_Snapshot);
        driver.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        performDefaults();

        return content;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.preference.PreferencePage#performOk()
     */
    @Override
    public boolean performOk() {
        performApply();
        return super.performOk();
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.preference.PreferencePage#performApply()
     */
    @Override
    protected void performApply() {
        switch (driver.getSelectionIndex()) {
            case 0:
                getPreferenceStore().setValue(YahooJapanActivator.PREFS_DRIVER, SnapshotConnector.class.getName());
                break;
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
     */
    @Override
    protected void performDefaults() {
        driver.select(getDriverIndex());
    }

    protected int getDriverIndex() {
        String driver = getPreferenceStore().getString(YahooJapanActivator.PREFS_DRIVER);
        if (driver.equals(SnapshotConnector.class.getName())) {
            return 0;
        }
        return 0;
    }
}
