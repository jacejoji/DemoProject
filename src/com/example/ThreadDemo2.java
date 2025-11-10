package com.example;

public class ThreadDemo2 implements Runnable {
	public void run() {
	System.out.println(Thread.currentThread().getName()+" Thread is running");
	}

}
