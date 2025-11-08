package com.tasks.week1;

public class Truck extends Vehicle {
    public Truck(double fuelEfficiency) {
        super(fuelEfficiency);
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
