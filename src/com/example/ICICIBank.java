package com.example;

public class ICICIBank  implements Loan{

	@Override
	public int  interestRate(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Interest rate of ICICI Bank is 5%");
		return amount*5/100;
		
	}
	

}
