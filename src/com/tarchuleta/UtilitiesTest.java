package com.tarchuleta;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Antonio on 10/9/2017.
 */
public class UtilitiesTest {

    private Utilities xcel;

    @Before
    public void setup() {
        xcel = new Utilities();
    }

    @Test
    public void testEveryNthChar() throws Exception {
        fail("This test has not been implemented");

    }

    @Test
    public void testRemovePairs() throws Exception {
        //fail("This test has not been implemented");
        String string = xcel.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", string);
    }

    @Test
    public void testRemovePairs2() throws Exception {
        //fail("This test has not been implemented");
        String string = xcel.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF", string);
    }

    @Test
    public void testConverter() throws Exception {
        fail("This test has not been implemented");

    }

    @Test
    public void testNullIfOddLength() throws Exception {
        fail("This test has not been implemented");

    }
}