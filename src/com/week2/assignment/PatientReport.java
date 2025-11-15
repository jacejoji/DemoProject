package com.week2.assignment;

import java.io.Serializable;

public class PatientReport implements Serializable {
    String reportName;

    public PatientReport(String rn) {
        reportName = rn;
    }
}

