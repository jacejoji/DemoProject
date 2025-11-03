package com.example;
import java.util.Scanner;
public class CConvert { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some string:");
		String str=sc.next();
		String st="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>96)
			{
				st+=String.valueOf((char)(str.charAt(i)-32));
			}else
			{
				st+=String.valueOf((char)(str.charAt(i)+32));
			}
		}
		System.out.println(st);
	}

}
