package com.week2.assignment;

import java.io.Serializable;

public class Patient implements Serializable {
    String name;
    int age;
    public Patient(String n, int a) { name = n; age = a; }
}
