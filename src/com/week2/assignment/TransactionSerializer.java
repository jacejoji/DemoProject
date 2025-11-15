package com.week2.assignment;

import java.io.*;

public class TransactionSerializer {

    public synchronized void saveTransaction(Account a) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("transactions.ser", true))) {

            oos.writeObject(a);
            System.out.println("Saved Transaction: " + a.accNo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
