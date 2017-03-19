package com.assign2;

import junit.framework.TestCase;

/**
 * Created by Sulaiman Samaai on 2017/03/19.
 */
public class multiplicationCalcTest extends TestCase {
    public void testMultiplication() throws Exception {

        assertEquals("Expected value was inadequate: ", multiplicationCalc.multiplication(5, 5), 25);
    }
}
