package com.tasks.week1;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean isPassing() {
        return getAverage() >= 60;
    }

    public String getName() {
        return name;
    }
}

