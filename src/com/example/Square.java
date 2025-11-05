package com.example;

public class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//holo square 
		int n = 10; // size of the square

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
