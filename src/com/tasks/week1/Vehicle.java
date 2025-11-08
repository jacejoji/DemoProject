package com.tasks.week1;

public abstract class Vehicle {
    protected double fuelEfficiency;  // miles per gallon

    public Vehicle(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}

