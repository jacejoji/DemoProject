package com.week2.assignment;

public class MainStats {
    public static void main(String[] args) {

        Runnable task = () -> {
            HospitalStats.patientCount++;
            HospitalStats.saveStats();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
