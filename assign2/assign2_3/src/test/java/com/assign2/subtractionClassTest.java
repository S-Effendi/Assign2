package com.assign2;

import junit.framework.TestCase;

/**
 * Created by Sulaiman Samaai on 2017/03/19.
 */
public class subtractionClassTest extends TestCase {
    public void testSubtraction() throws Exception {

        assertEquals("Expected value was inadequate: ", subtractionCalc.subtraction(10, 5), 5);
    }
}
