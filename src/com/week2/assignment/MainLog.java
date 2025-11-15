package com.week2.assignment;

public class MainLog {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> LogWriter.writeLog("Thread 1 log"));
        Thread t2 = new Thread(() -> LogWriter.writeLog("Thread 2 log"));

        t1.start();
        t2.start();
    }
}

