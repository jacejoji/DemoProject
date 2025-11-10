package com.threadexample;

public class Customer {
	int amount=2000;
	public synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Insufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Amount withdrawn:"+amount);
			return;
		}else
		this.amount=this.amount-amount;
		System.out.println("Amount withdrawn:"+amount);
	}
	
	public synchronized void deposit(int amount) {
		if(amount<0) {
			System.out.println("Invalid amount");
			return;
		}else
		this.amount=this.amount+amount;
		System.out.println("Deposited");
		notify();
	}
public static void main(String[] args) {
	Customer c=new Customer();
	for(int i=1;i<=3;i++)
	new Thread()
	{
		public void run() {
			c.withdraw(3000);
		}
	}.start();
	for(int i=1;i<=5;i++) {
		new Thread()
		{
			public void run() {
				c.deposit(2000);
			}
		}.start();
	}
}
}
