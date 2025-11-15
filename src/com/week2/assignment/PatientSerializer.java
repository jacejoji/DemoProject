package com.week2.assignment;

import java.io.*;

public class PatientSerializer {

    public synchronized void savePatient(Patient p) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("patients.ser", true))) {

            oos.writeObject(p);
            System.out.println("Saved: " + p.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
