package com.example;
import java.util.Scanner;
public class CountVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some string:");
		String str=sc.next();
		StringBuffer st=new  StringBuffer(str);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='e' || st.charAt(i)=='i' ||st.charAt(i)=='o' ||st.charAt(i)=='u')
			{
				System.out.println(st.charAt(i));
				count++;
			}
		}
		System.out.println("Total count: "+count);
		sc.close();
	}
}
