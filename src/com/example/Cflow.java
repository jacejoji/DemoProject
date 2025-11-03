package com.example;

import java.util.Scanner;

public class Cflow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark:");
		int m=sc.nextInt();
		if(m>0 && m<40)
		{
			System.out.println("!!FAIL!!");
		}else if(m>=40 && m<60)
		{
			System.out.println("!!PASS!!");
		}else if(m>=60 && m<=100)
		{
			System.out.println("!!PASS!! Remark: Good Marks");
		}else
		{
			System.out.println("!!Invalid Mark!!");
		}
		sc.close();
	}
	

}
