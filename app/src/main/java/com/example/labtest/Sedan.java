package com.example.labtest;

public class Sedan extends Vehicle {
    public Sedan() {
        super(4);
    }

    @Override
    public void drive() {
        if (this.fuel >= 2) {
            this.mileage += 5;
            this.fuel -= 2;
        }
    }
}
