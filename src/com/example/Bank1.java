package com.example;

public class Bank1 {
	int amount=2000;
	//check balance
	void balance()
	{
		System.out.println("Balance is "+amount);
	}
	//withdraw
	void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance");
			return;
		}else
		this.amount=this.amount-amount;
		System.out.println("Amount withdrawn:"+amount);
	}
	//deposit
	void deposit(int amount)
	{
		if(amount<0)
		{
			System.out.println("Invalid amount");
			return;
		}else
		this.amount=this.amount+amount;
		System.out.println("Deposited");
	}

	public static void main(String[] args) {
Bank1 b=new Bank1();
b.balance();
b.withdraw(500);
b.balance();
b.deposit(10000);
b.balance();
	}
}