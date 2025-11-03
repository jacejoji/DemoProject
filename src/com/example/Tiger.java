package com.example;

public class Tiger  extends Animal{
	Tiger(){
		super(5);
		System.out.println("Tiger created!");
	}
	int legs=super.legs+50;
	void run() {
		super.eat();
		System.out.println("Runs fast");
	}
	void eat() {
		super.eat();
		System.out.println("Eats non-veg");
	}
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.run();
		t.sleep();
		System.out.println("Tiger has "+t.legs+" legs");
	}
}
