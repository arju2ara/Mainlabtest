package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class RedTest extends TestCase {


    @Test
    public void testRedColor() {
        Red red = new Red();
        assertEquals("Red", red.showColor());
    }

}