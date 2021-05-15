/*
 * @(#)GapsLayout.java	1.6 95/01/31 Arthur van Hoff
 *
 * Copyright (c) 1994 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package awt;

/**
 * Layout with gaps (abstract class)
 *
 * @version 1.6 31 Jan 1995
 * @author Arthur van Hoff
 */

public class GapsLayout extends ContainerLayout {
    int gaps[] = new int[4];

    /**
     * Set the gaps (the distances between members
     * in the container).
     */
    public void setGaps(int n, int e, int s, int w) {
	gaps[NORTH] = n;
	gaps[EAST]  = e;
	gaps[SOUTH] = s;
	gaps[WEST]  = w;
    }
    protected int max(int a, int b) {
	return ((a > b) ? a : b);
    }
}
