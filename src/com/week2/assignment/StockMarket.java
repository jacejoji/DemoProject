package com.week2.assignment;

import java.util.*;

class StockThread extends Thread {
    private String stockName;
    private Random random = new Random();
    public int price = 100;

    public StockThread(String stockName) {
        this.stockName = stockName;
    }

    public void run() {
        try {
            while (true) {
            price += random.nextInt(11) - 5;
            Thread.sleep(3000);
        }
        } catch (InterruptedException e) {}
    }
}

public class StockMarket {

    public static void main(String[] args) {
        StockThread s1 = new StockThread("AAPL");
        StockThread s2 = new StockThread("TSLA");

        s1.start();
        s2.start();

        while (true) {
            System.out.println("AAPL: " + s1.price);
            System.out.println("TSLA: " + s2.price);
            System.out.println("------------------");

            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }
}

