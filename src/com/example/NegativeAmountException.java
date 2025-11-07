package com.example;

public class NegativeAmountException extends Exception {
	int amount;
	public NegativeAmountException(int amount) {
		this.amount=amount;
		System.out.println("Amount is negative");
	}

}
