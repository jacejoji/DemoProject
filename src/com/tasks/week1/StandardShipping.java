package com.tasks.week1;

public class StandardShipping implements ShippingService {
    public double calculateShippingCost(double distance, double weight) {
        return 5.00 + (0.05 * weight) + (0.02 * distance);  // base + weight + distance
    }

    public int getDeliveryTime() {
        return 7;  // days
    }
}
