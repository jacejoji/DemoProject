package com.example.tasksweek1;

public class FastTrackWatch  implements SmartWatch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastTrackWatch f=new FastTrackWatch();
		f.screenSize();
		f.battery();
		f.connectivity();
		f.price();
		System.out.println("FastTrack Watch"+"uses"+f.os);

	}

	@Override
	public void screenSize() {
		// TODO Auto-generated method stub
		System.out.println("Screen size is 1.5 inch");
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("Battery life is 2 hours");
		
	}

	@Override
	public void connectivity() {
		// TODO Auto-generated method stub
		System.out.println("Connectivity is 4G");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price is 5000");
		
	}

}
