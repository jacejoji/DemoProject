package com.example;

public class Animal {
	Animal(int legs){
		this.legs=legs;
	}
	Animal(){
	
		System.out.println("Animal created!");
	}
	int legs=4;
	void eat() {
		System.out.println("Eating something...");
	}
	void sleep() {
		System.out.println("Sleeping...");
	}
	
}
