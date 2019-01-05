package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTheStringTest {
    ReverseTheString ob;
    @Before
    public void setUp() throws Exception {
        ob = new ReverseTheString();
    }

    @After
    public void tearDown() throws Exception {ob=null;
    }

    @Test
    public void reversesuccess() {
        String expectedValue="abcde";
        String actualValue = ob.reverse("edcba");
        assertEquals(expectedValue,actualValue);
    }

}