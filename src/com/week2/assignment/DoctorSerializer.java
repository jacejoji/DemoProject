package com.week2.assignment;

import java.io.*;

public class DoctorSerializer {

    public synchronized void serializeDoctor(Doctor d) {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(d.name + ".ser"))) {

            oos.writeObject(d);
            System.out.println("Serialized: " + d.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
