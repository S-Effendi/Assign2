package com.assign2;

import junit.framework.TestCase;

/**
 * Created by Sulaiman Samaai on 2017/03/19.
 */
public class divisionCalcTest extends TestCase {
    public void testDivision() throws Exception {

        assertEquals("Expected value was inadequate: ", divisionCalc.division(44, 11), 4);
    }
}

