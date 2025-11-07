package com.example.tasksweek1;

public class PaypalPayment extends PaymentSystem{
	void pay(double amount) {
		System.out.println("Paypal payment of "+amount);
	}
	public static void main(String[] args) {
		PaypalPayment p=new PaypalPayment();
		p.pay(1000);
		PaymentSystem p1=new PaypalPayment();
		p1.pay(1000);
	}

}
