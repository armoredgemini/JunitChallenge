package com.tarchuleta;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

/**
 * Created by Antonio on 10/17/2017.
 */
@RunWith(Parameterized.class)
public class UtilitiesParameterizedTest {
    private Utilities util;

    private String string;
    private String expected;

    public UtilitiesParameterizedTest(String string, String expected) {
        this.string = string;
        this.expected = expected; 
    }

    @Before
    public void Setup() {
        util = new Utilities();
        System.out.println("Running Test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}

        });
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals(expected, util.removePairs(string));
    }
}
