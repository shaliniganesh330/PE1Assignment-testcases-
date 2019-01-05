package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckTest {
    OddEvenCheck ob;
    @Before
    public void setUp() throws Exception {
    ob = new OddEvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void Testoddoreven() throws Exception{
        int num = 22;
        String expectedValue_1 = "Jerry";
        String actualValue_1 = ob.oddeven_1(num);
        assertEquals(expectedValue_1,actualValue_1);
    }
    @Test
    public void Testoddoreven_2() throws Exception {
        int num2 = 18;
        String expectedValue_1 = "Invalid input";
        String actualValue_1 = ob.oddeven_1(num2);
        assertEquals(expectedValue_1,actualValue_1);
    }

    @Test
    public void Testoddoreven_3() throws Exception {
        int num3 = 27;
        String expectedValue_1 = "Tom";
        String actualValue_1 = ob.oddeven_1(num3);
        assertEquals(expectedValue_1,actualValue_1);
    }
}