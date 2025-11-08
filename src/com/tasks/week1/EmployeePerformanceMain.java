package com.tasks.week1;

import java.util.ArrayList;

public class EmployeePerformanceMain {
    public static void main(String[] args) {
        ArrayList<EmployeePerformance> employees = new ArrayList<>();
        EmployeePerformance employee1 = new EmployeePerformance("John");
        employee1.setRating(4.5);
        employee1.calculateBonus();

        employees.add(employee1);

        for (EmployeePerformance employee : employees) {
            System.out.println(employee.getName() + " Bonus: $" + employee.getBonus());
        }
    }
}

