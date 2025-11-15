package com.week2.assignment;

public class MainPatient {
    public static void main(String[] args) {
        PatientSerializer ps = new PatientSerializer();

        Thread t1 = new Thread(() ->
                ps.savePatient(new Patient("Alex", 20)));

        Thread t2 = new Thread(() ->
                ps.savePatient(new Patient("Mary", 22)));

        t1.start();
        t2.start();
    }
}
