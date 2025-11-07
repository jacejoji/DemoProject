package com.example;

public class Bank {
	static int amount=2000;
	static void transfer()
	{
		amount++;
	}
	void withdraw(int amount) 
	{
		try {
			this.amount-=amount;
			throw new NegativeAmountException(amount);
		}
		catch(NegativeAmountException e){
			System.out.println("Amount is negative");
		}
	}
	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank();
		System.out.println("1st Object: "+b1.amount+" 2nd Object: "+b2.amount+" Class: "+Bank.amount);
		Bank.transfer();
		System.out.println("1st Object: "+b1.amount+" 2nd Object: "+b2.amount+" Class: "+Bank.amount);
		
	}

}
