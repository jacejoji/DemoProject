package com.tasks.week1;

import java.util.ArrayList;

public class BankingAccountMain {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1000, 0.05));
        accounts.add(new CheckingAccount(2000, 0.03));

        for (BankAccount account : accounts) {
            System.out.println("Interest: $" + account.calculateInterest());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("------");
        }
    }
}
