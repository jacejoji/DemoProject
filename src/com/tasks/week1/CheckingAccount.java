package com.tasks.week1;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

