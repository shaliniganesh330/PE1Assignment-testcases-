package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber ob;
    @Before
    public void setUp() throws Exception {
        ob = new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }


    @Test
    public void guess1() {
        String expectedValue = "Number guessed is lesser";
        String actualValue = ob.guess(1);
        assertEquals(expectedValue, actualValue);

        String expectedValue1 = "Number guessed is greater";
        String actualValue1 = ob.guess(67);
        assertEquals(expectedValue1, actualValue1);

        String expectedValue2 = "Number guessed is correct";
        String actualValue2 = ob.guess(29);
        assertEquals(expectedValue2, actualValue2);
    }
    @Test
    public void TestCheckNumberFailure() {
        String expectedValue_1 = "null";
        //Act
        String actualValue_1 = ob.guess(-1);
        //Assert
        assertEquals(expectedValue_1,actualValue_1);

    }
}