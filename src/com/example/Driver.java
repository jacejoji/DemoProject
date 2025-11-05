package com.example;

public class Driver extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d=new Driver();
		d.color();
		d.model();
		d.price();
	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price is 100000");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed is 200");
		
	}

}
