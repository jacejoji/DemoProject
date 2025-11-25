package com.week2.topic;

import java.util.function.*;

class Calculator {
    // Instance methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Constructor
    public Calculator() {
        System.out.println("Calculator created!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Using Constructor Reference to create Calculator object
        Supplier<Calculator> calculatorSupplier = Calculator::new;
        Calculator calc = calculatorSupplier.get();  // Calls the constructor of Calculator
        // Using instance method references
        BiFunction<Integer, Integer, Integer> addition = calc::add;
        BiFunction<Integer, Integer, Integer> subtraction = calc::subtract;
        
        // Using static method reference
        BiFunction<Integer, Integer, Integer> multiplication = Calculator::multiply;
        
        // Perform calculations
        int a = 10, b = 5;
        int sum = addition.apply(a, b);
        int diff = subtraction.apply(a, b);
        int product = multiplication.apply(a, b);
        
        // Output results
        System.out.println("Addition: " + sum);          // 10 + 5 = 15
        System.out.println("Subtraction: " + diff);      // 10 - 5 = 5
        System.out.println("Multiplication: " + product); // 10 * 5 = 50
    }
}
