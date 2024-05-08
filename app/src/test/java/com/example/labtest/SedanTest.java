package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class SedanTest extends TestCase {
    private Sedan sedan;


    public void setUp() {
        sedan = new Sedan();
        sedan.petrol(10);
    }

    @Test
    public void testDrive() {
        sedan.drive();
        assertEquals("Expected mileage after one drive", 5.0, sedan.getMileage(), 0.01);
        assertEquals("Expected fuel after one drive", 8.0, sedan.getFuel(), 0.01);
    }

    @Test
    public void testDriveWithoutEnoughFuel() {
        sedan.petrol(-9);
        sedan.drive();
        assertEquals("Mileage should not increase if not enough fuel", 0.0, sedan.getMileage(), 0.01);
        assertEquals("Fuel should not decrease if not enough to drive", 1.0, sedan.getFuel(), 0.01);
    }

}