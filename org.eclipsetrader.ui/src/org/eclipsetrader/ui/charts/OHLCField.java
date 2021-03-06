/*
 * Copyright (c) 2004-2011 Marco Maccaferri and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Marco Maccaferri - initial API and implementation
 */

package org.eclipsetrader.ui.charts;

public enum OHLCField {
    Open("open", Messages.OHLCField_Open), High("high", Messages.OHLCField_High), Low("low", Messages.OHLCField_Low), Close("close", Messages.OHLCField_Close); //$NON-NLS-1$ //$NON-NLS-3$ //$NON-NLS-5$ //$NON-NLS-7$

    private String name;
    private String description;

    OHLCField(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static OHLCField getFromName(String name) {
        OHLCField[] l = values();
        for (int i = 0; i < l.length; i++) {
            if (l[i].getName().equals(name)) {
                return l[i];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return description;
    }
}
