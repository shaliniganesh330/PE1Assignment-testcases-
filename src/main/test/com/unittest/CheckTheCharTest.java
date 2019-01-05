package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTheCharTest {
    CheckTheChar ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckTheChar();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void charchecksuccess() {
        String expectedValue = "Small letter";
        String actualValue = ob.charcheck('a');
        assertEquals(expectedValue, actualValue);
    }
        @Test
        public void charcheck1() {
            String expectedValue_1 = "Capital letter";
            String actualValue_1 = ob.charcheck('A');
            assertEquals(expectedValue_1, actualValue_1);
        }
    @Test
    public void charcheck2() {
        String expectedValue_2 = "Digit";
        String actualValue_2 = ob.charcheck('1');
        assertEquals(expectedValue_2, actualValue_2);
    }
    @Test
    public void charcheck3() {
        String  expectedValue_3 ="Special character";
        String actualValue_3 = ob.charcheck('!');
        assertEquals(expectedValue_3,actualValue_3);
    }
}