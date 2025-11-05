package com.example;

public class Theater implements MalayalamMovies, TamilMovies{
int total=0;
	@Override
	public void Kathi() {
		// TODO Auto-generated method stub
		System.out.println("The price of Kathi is 100");
		total=total+100;
		
	}

	@Override
	public void Leo() {
		// TODO Auto-generated method stub
		System.out.println("The price of Leo is 200");
		total=total+200;
		
	}

	@Override
	public void petDetective() {
		// TODO Auto-generated method stub
		System.out.println("The price of pet Detective is 300");
		total=total+300;
		
	}
	public void total() {
		System.out.println("Total: "+total);
	}

}
