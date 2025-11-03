package com.example;

public class Monkey  extends Tiger{
void eat() {
	super.eat();
	System.out.println("Eats fruits");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m=new Monkey();
		m.eat();
	}

}
