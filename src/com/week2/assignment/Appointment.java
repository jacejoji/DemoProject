package com.week2.assignment;

import java.io.Serializable;

public class Appointment implements Serializable {
    String doctor;
    String patient;

    public Appointment(String d, String p) {
        doctor = d;
        patient = p;
    }
}

