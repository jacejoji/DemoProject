package com.week2.assignment;

public class ATM {

    private double balance = 1000;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        try {
            atm.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}

