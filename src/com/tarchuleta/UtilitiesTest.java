package com.tarchuleta;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.junit.Before;
import org.junit.Test;

import java.io.CharArrayReader;

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
        //fail("This test has not been implemented");
        assertArrayEquals("el".toCharArray(), xcel.everyNthChar("hello".toCharArray(), 2));
        assertArrayEquals("test".toCharArray(), xcel.everyNthChar("test".toCharArray(), 8));
    }

    @Test
    public void testRemovePairs() throws Exception {
        //fail("This test has not been implemented");
        String string = xcel.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", string);
        assertEquals("ABCABDEF", xcel.removePairs("ABBCAABBBDEEFF"));
        assertEquals("A", xcel.removePairs("AA"));
        assertEquals("A", xcel.removePairs("A"));
        assertEquals("ABC32D", xcel.removePairs("AABCC32D"));
        assertEquals("ABCDEF", xcel.removePairs("ABBBCDDEFF"));
        assertEquals("123456", xcel.removePairs("1223334566"));
        assertEquals("123@4!56", xcel.removePairs("122333@@4!!!!566"));
        assertNull("Message if null is not returned", xcel.removePairs(null));
    }

    @Test
    public void testConverter() throws Exception {
        //fail("This test has not been implemented");

        assertEquals(300, xcel.converter(10, 5));
    }


    @Test(expected = ArithmeticException.class)
    public void testConverterMath() throws Exception {

        assertEquals(300, xcel.converter(10, 0));
    }

    @Test
    public void testNullIfOddLength() throws Exception {
        // fail("This test has not been implemented");
        assertEquals("this is even", xcel.nullIfOddLength("this is even"));
        assertNull("Message if this is not null", xcel.nullIfOddLength("this is odd"));

    }


}