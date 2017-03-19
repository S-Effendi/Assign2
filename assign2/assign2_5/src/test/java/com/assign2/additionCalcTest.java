package com.assign2;

import junit.framework.TestCase;

/**
 * Created by Sulaiman Samaai on 2017/03/19.
 */
public class additionCalcTest extends TestCase {
    public void testAddition() throws Exception {

        assertEquals("Expected value was inadequate: ", additionCalc.addition(100, 46), 146);
    }
}
