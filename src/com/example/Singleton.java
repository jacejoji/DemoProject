package com.example;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void display() {
		System.out.println("Singleton");
	}
	
	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		Singleton s1=Singleton.getInstance();
		s.display();
		s1.display();
		System.out.println(s);
		System.out.println(s1);
	}

}
