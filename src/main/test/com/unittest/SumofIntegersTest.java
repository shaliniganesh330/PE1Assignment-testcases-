package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumofIntegersTest {
    SumOfIntegers ob;
    @Before
    public void setUp() throws Exception {
        ob = new SumOfIntegers();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void sumofintergers_success() {
        String string ="1 1 1 1 1 1 1 1";
        int expectedValue = 8;
        int actualValue = ob.integersum(string);
        assertEquals(expectedValue,actualValue);
    }
}