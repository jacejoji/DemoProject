package com.tasks.week1;

import java.util.ArrayList;

public class StudentManagementMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Alice");
        student1.addGrade(85);
        student1.addGrade(90);

        students.add(student1);

        for (Student student : students) {
            System.out.println(student.getName() + " Average: " + student.getAverage());
            System.out.println(student.getName() + " is " + (student.isPassing() ? "Passing" : "Failing"));
        }
    }
}
