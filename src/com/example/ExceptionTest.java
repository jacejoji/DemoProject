package com.example;

import java.io.DataInputStream;
import java.io.IOException;

public class ExceptionTest {
	
	public static int  divide(int x, int y) {
		try {
			y = x/y;
			try {
				return x/y;
			}
			finally {
				System.out.println("finally");
				
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Exception");
			return 0 ;
		}
		catch(Exception e) {
			System.out.println("Exception");
			return 0;
		}
		finally {
			System.out.println("finally");
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=22,y=0;
		System.out.println("Start of the code");
		System.out.println(divide(x,y));
		System.out.println("Rest of the code");
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter name:");
		String a="";
		try {
			a=d.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Welcome"+a);

	}

}
