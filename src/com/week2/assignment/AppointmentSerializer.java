package com.week2.assignment;

import java.io.*;

public class AppointmentSerializer {

    public synchronized void saveAppointment(Appointment a) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("appointments.ser", true))) {

            oos.writeObject(a);
            System.out.println("Saved Appointment: " + a.patient);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
