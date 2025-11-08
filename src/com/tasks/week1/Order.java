package com.tasks.week1;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<String> items;
    private double totalPrice;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
