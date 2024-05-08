package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class BlueTest extends TestCase {

    @Test
    public void testBlueColor() {
        Blue blue = new Blue();
        assertEquals("Blue", blue.showColor());
    }

}