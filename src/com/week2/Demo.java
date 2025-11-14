package com.week2;

public class Demo {
	Demo()
	{
		System.out.println("Inside Constructor");
	}
	public void testeat()
	{
		System.out.println("Eating");
	}
	public static void print()
	{
		System.out.println("Printing something:");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		//Animal a=d::testeat;  ###instance method
		//Animal a=Demo::new;  ###Constructor
		Animal a=Demo::print;  //###STatic method
		a.eat();
	}
	

}
