package com.tasks.week1;

public abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }
}

