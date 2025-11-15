package com.week2.assignment;

import java.io.Serializable;

public class Account implements Serializable {
    int accNo;
    double balance;

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

