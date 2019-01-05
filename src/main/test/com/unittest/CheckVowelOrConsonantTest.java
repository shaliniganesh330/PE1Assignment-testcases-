package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelOrConsonantTest {
    CheckVowelOrConsonant ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckVowelOrConsonant();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void vowelorconsonant_1() {
//        char ch = 'a' ;
        String expectedValue_1 = "vowel";
        String actualValue_1 = ob.vowelorconsonant_1("a");
        assertEquals(expectedValue_1,actualValue_1);
    }

    @Test
    public void vowelorconsonant_2() {
        char ch1 = 'p' ;
        String expectedValue_2 = "consonant";
        String actualValue_2 = ob.vowelorconsonant_1("c");
        assertEquals(expectedValue_2,actualValue_2);
    }
}