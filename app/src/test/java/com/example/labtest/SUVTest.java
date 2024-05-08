package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class SUVTest extends TestCase {

    private SUV suv;


    public void setUp() {
        suv = new SUV();
        suv.petrol(10);
    }

    @Test
    public void testDrive() {
        suv.drive();
        assertEquals("Expected mileage after one drive", 4.0, suv.getMileage(), 0.01);
        assertEquals("Expected fuel after one drive", 7.5, suv.getFuel(), 0.01);
    }

}