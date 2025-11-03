package com.example;

import java.util.Scanner;

public class DtoB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		while(n>=1)
		{
		  r= r*10+n%2;
		  n=n/2;
		}
		System.out.println(r);
		int res=0;
		int i=0;
		while(r>0)
		{	
		 res+=(r%10)*(int)Math.pow(2, i);
		 r=r/10;
		 i++;
		}
		System.out.println(res);
		sc.close();
	}

}
