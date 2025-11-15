package com.week2.assignment;

class DeliveryThread implements Runnable {
    public void run() {
        String[] status = {
            "Order Placed", "Preparing", "Out for Delivery", "Arriving Soon"
        };

        try {
            for (String s : status) {
                System.out.println("Status: " + s);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ETAThread implements Runnable {
    public void run() {
        try {
            for (int min = 30; min >= 0; min -= 5) {
                System.out.println("ETA: " + min + " minutes");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {}
    }
}

public class DeliveryStatusUpdater {
    public static void main(String[] args) {
        new Thread(new DeliveryThread()).start();
        new Thread(new ETAThread()).start();
    }
}

