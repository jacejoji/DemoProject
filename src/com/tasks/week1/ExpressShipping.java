package com.tasks.week1;

public class ExpressShipping implements ShippingService {
    public double calculateShippingCost(double distance, double weight) {
        return 10.00 + (0.10 * weight) + (0.05 * distance);  // base + weight + distance
    }

    public int getDeliveryTime() {
        return 2;  // days
    }
}

