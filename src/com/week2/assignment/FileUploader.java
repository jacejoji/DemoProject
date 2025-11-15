package com.week2.assignment;

import java.io.*;

public class FileUploader {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            File file = new File("input.txt"); 
            fis = new FileInputStream(file);

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (SecurityException e) {
            System.out.println("Permission denied to access the file!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error closing the file!");
            }
        }
    }
}

