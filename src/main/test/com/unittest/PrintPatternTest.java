package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintPatternTest {
    PrintPattern ob;
    @Before
    public void setUp() throws Exception {
        ob = new PrintPattern();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void pattern_1success() {
      String expectedValue = "122333";
      String actualValue = ob.pattern_1(3);
        assertEquals(expectedValue,actualValue);
    }
}
