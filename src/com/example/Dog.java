package com.example;

public class Dog {

	int legs=4;
	void eat()
	{
		System.out.println("Eating something...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		System.out.println("Dog has "+d.legs);
		d.eat();

	}

}
