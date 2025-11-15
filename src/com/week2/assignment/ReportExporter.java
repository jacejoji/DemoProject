package com.week2.assignment;

import java.io.*;

public class ReportExporter {

    public void exportReport(PatientReport report) {
        synchronized (report) {
            try (ObjectOutputStream oos =
                         new ObjectOutputStream(new FileOutputStream(report.reportName + ".ser"))) {

                oos.writeObject(report);
                System.out.println("Exported report: " + report.reportName);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

