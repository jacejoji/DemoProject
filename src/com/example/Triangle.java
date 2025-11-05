package com.example;

public class Triangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Drawing Triangle");
		//equilateral triangle with space inside
		 int n = 10; // number of rows

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < i + 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
	public void sides() {
		System.err.println("Ït has 3 sides");
	}

}
