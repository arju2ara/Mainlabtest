package com.example.labtest;

public class SUV extends Vehicle {
    public SUV() {
        super(4);
    }

    @Override
    public void drive() {
        if (this.fuel >= 2.5) {
            this.mileage += 4;
            this.fuel -= 2.5;
        }
    }
}
