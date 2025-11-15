package com.week2.assignment;

import java.io.*;

public class LogWriter {

    public static synchronized void writeLog(String msg) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("log.txt", true))) {

            oos.writeObject(msg);
            System.out.println("Log written: " + msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

