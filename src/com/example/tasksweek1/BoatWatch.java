package com.example.tasksweek1;

public class BoatWatch implements SmartWatch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoatWatch b=new BoatWatch();
		b.screenSize();
		b.battery();
		b.connectivity();
		b.price();
		System.out.println("Boat Watch"+"uses"+b.os);
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price is 10000");
		
	}

	@Override
	public void screenSize() {
		// TODO Auto-generated method stub
		System.out.println("Screen size is 1 inch");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery life is 1 hour");
		
	}

	@Override
	public void connectivity() {
		// TODO Auto-generated method stub
		System.out.println("Connectivity is 3G");
	}
	

}
