package com.tasks.week1;

import java.util.ArrayList;

public class InventoryManagementMain {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        Product product1 = new Product("Laptop", 1000, 10);
        inventory.add(product1);

        System.out.println("Total Inventory Value: $" + calculateTotalValue(inventory));
    }

    public static double calculateTotalValue(ArrayList<Product> inventory) {
        double totalValue = 0;
        for (Product product : inventory) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }
}

