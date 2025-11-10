package com.threadexample;

public class table {
	public static synchronized void print(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		System.out.println(Thread.currentThread().getName());
	}

}
