package com.week2.assignment;

import java.io.*;

public class HospitalStats implements Serializable {

    static int patientCount = 0;

    public static synchronized void saveStats() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("stats.ser"))) {

            oos.writeObject(patientCount);
            System.out.println("Saved stats: " + patientCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

