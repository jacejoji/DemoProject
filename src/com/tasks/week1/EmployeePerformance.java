package com.tasks.week1;

public class EmployeePerformance {
    private String name;
    private double rating;
    private double bonus;

    public EmployeePerformance(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void calculateBonus() {
        this.bonus = rating * 1000;  // e.g., rating out of 5
    }

    public double getBonus() {
        return bonus;
    }

    public String getName() {
        return name;
    }
}
