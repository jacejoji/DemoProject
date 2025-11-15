package com.week2.assignment;

import java.io.*;

public class ClinicConfig implements Serializable {

    static String hospitalName = "City Hospital";
    static String location = "Mumbai";

    public static synchronized void saveConfig() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("config.ser"))) {

            oos.writeObject(new ClinicConfig());
            System.out.println("Configuration Saved.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

