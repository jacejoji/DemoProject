package com.example;

public class SBIBank implements Loan {

	@Override
	public int interestRate(int amount) {
System.out.println("Interest rate for SBI bank is 6%");		
		return amount*6/100;
	}

}
