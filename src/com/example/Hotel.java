package com.example;

public class Hotel implements NonVeg, Veg{
	int total=0;
	@Override
	public void vegcurry() {
		// TODO Auto-generated method stub
		System.out.println("Veg Curry price is 100");
		total=total+100;
	}
	@Override
	public void vegbiryani() {
		// TODO Auto-generated method stub
		System.out.println("Veg Biryani price is 200");
		total=total+200;
	}
	@Override
	public void chicken() {
		// TODO Auto-generated method stub
		System.out.println("Chicken price is 300");
		total=total+300;
	}

	@Override
	public void mutton() {
		// TODO Auto-generated method stub
		System.out.println("Mutton price is 400");
		total=total+400;
	}
	public void total() {
		System.out.println("Total: "+total);
	}
}
