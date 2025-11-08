package com.tasks.week1;

public class Motorcycle extends Vehicle {
    public Motorcycle(double fuelEfficiency) {
        super(fuelEfficiency);
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
