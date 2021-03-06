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

package org.eclipsetrader.internal.brokers.paper.schemes;

import org.eclipsetrader.internal.brokers.paper.IExpenseScheme;

public class LimitedProportional1Scheme implements IExpenseScheme {

    private double percentage = 0.19;
    private double minimum = 2.0;
    private double maximum = 19.0;

    public LimitedProportional1Scheme() {
    }

    /* (non-Javadoc)
     * @see org.eclipsetrader.internal.brokers.paper.IExpenseScheme#getBuyExpenses(java.lang.Long, java.lang.Double)
     */
    @Override
    public Double getBuyExpenses(Long quantity, Double averagePrice) {
        double expenses = quantity * averagePrice / 100.0 * percentage;
        if (expenses < minimum) {
            expenses = minimum;
        }
        if (expenses > maximum) {
            expenses = maximum;
        }
        return expenses;
    }

    /* (non-Javadoc)
     * @see org.eclipsetrader.internal.brokers.paper.IExpenseScheme#getSellExpenses(java.lang.Long, java.lang.Double)
     */
    @Override
    public Double getSellExpenses(Long quantity, Double averagePrice) {
        double expenses = quantity * averagePrice / 100.0 * percentage;
        if (expenses < minimum) {
            expenses = minimum;
        }
        if (expenses > maximum) {
            expenses = maximum;
        }
        return expenses;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.getClass().equals(obj.getClass());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return 11 * toString().hashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Messages.LimitedProportional1Scheme_LimitedProportionalScheme;
    }
}
