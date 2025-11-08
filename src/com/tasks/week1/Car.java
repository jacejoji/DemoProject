package com.tasks.week1;

public class Car extends Vehicle {
    public Car(double fuelEfficiency) {
        super(fuelEfficiency);
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
