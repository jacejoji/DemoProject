package com.example;

import java.util.Scanner;

public class Snum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int s=0;
		for(int i=0;i<=n;i++)
		{
			s+=i;
		}
		System.out.println(s);
		sc.close();

	}

}
