package com.tasks.week1;

import java.util.ArrayList;

public class BookstoreInventoryMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 9.99));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 7.99));
        
        double totalValue = 0;
        for (Book book : books) {
            totalValue += book.getPrice();
        }

        System.out.println("Total Inventory Value: $" + totalValue);
    }
}
