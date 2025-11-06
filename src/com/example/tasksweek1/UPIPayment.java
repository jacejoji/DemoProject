package com.example.tasksweek1;

public class UPIPayment extends OnlinePayment {
	

	@Override
	void authenticate() {
		// TODO Auto-generated method stub
		System.out.println("UPI authentication is done");
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI payment of "+amount);
		
	}

}
