package com.tasks.week1;

import java.util.ArrayList;

public class VehicleMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(30));
        vehicles.add(new Truck(15));
        vehicles.add(new Motorcycle(50));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency() + " MPG");
        }
    }
}

