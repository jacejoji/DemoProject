package com.example.tasksweek1;

public abstract class OnlinePayment implements Payment {
	String accountId;
	void connect() {
		System.out.println("Connected");
	}
	abstract void authenticate();

}
