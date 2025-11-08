package com.tasks.week1;

public interface ShippingService {
    double calculateShippingCost(double distance, double weight);
    int getDeliveryTime();
}

