package com.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheNumbersTest {
    SortingTheNumbers ob;
    @Before
    public void setUp() throws Exception {
        ob = new SortingTheNumbers();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void Sortingsucess() {
    int expectedValue = 10;
    int actualValue = ob.sorting(23242);
    assertEquals(expectedValue,actualValue);
    }
}