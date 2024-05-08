package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class GreenTest extends TestCase {

    @Test
    public void testGreenColor() {
        Green green = new Green();
        assertEquals("Green", green.showColor());
    }

}