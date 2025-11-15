package com.week2.assignment;

import java.io.*;

public class FileExporter {

    private final Object lock = new Object();

    public void export(Object obj, String fileName) {
        synchronized (lock) {
            try (ObjectOutputStream oos =
                         new ObjectOutputStream(new FileOutputStream(fileName))) {

                oos.writeObject(obj);
                System.out.println("Exported to: " + fileName);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

