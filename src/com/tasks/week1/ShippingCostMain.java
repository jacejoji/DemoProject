package com.tasks.week1;

import java.util.ArrayList;

public class ShippingCostMain {
    public static void main(String[] args) {
        ArrayList<ShippingService> services = new ArrayList<>();
        services.add(new StandardShipping());
        services.add(new ExpressShipping());

        double distance = 1000; // in km
        double weight = 2.5;    // in kg

        for (ShippingService service : services) {
            System.out.println("Shipping Cost: $" + service.calculateShippingCost(distance, weight));
            System.out.println("Delivery Time: " + service.getDeliveryTime() + " days");
            System.out.println("------");
        }
    }
}
