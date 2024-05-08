package com.example.labtest;

import junit.framework.TestCase;

import org.junit.Test;

public class MotorcycleTest extends TestCase {

    private Motorcycle motorcycle;


    public void setUp() {
        motorcycle = new Motorcycle();
        motorcycle.petrol(3);
    }

    @Test
    public void testDrive() {
        motorcycle.drive();
        assertEquals("Expected mileage after one drive", 1.5, motorcycle.getMileage(), 0.01);
        assertEquals("Expected fuel after one drive", 2.5, motorcycle.getFuel(), 0.01);
    }

}