package com.week2.assignment;

public class MainTransaction {
    public static void main(String[] args) {

        TransactionSerializer ts = new TransactionSerializer();

        Thread t1 = new Thread(() ->
                ts.saveTransaction(new Account(101, 5000)));

        Thread t2 = new Thread(() ->
                ts.saveTransaction(new Account(102, 8000)));

        t1.start();
        t2.start();
    }
}
