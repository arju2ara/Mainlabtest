package com.example.labtest;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    @Override
    public void drive() {
        if (this.fuel >= 0.5) {
            this.mileage += 1.5;
            this.fuel -= 0.5;
        }
    }
}
