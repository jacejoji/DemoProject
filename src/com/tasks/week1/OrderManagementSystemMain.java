package com.tasks.week1;

import java.util.ArrayList;

public class OrderManagementSystemMain {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        Order order1 = new Order("Alice");
        order1.addItem("Laptop", 999.99);
        order1.addItem("Mouse", 25.50);

        orders.add(order1);

        for (Order order : orders) {
            System.out.println("Customer: " + order.getCustomerName());
            System.out.println("Items: " + order.getItems());
            System.out.println("Total Price: $" + order.getTotalPrice());
        }
    }
}

