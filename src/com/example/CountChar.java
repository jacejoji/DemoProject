package com.example;
import java.util.Scanner;
public class CountChar {
	
	@Override
	public String toString() {
		return "CountChar object";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some string:");
		String str=sc.next();
		StringBuffer st=new  StringBuffer(str);
		for(int i=0;i<st.length();i++)
		{ int count=0;
		  for(int j=0;j<st.length();j++)
		  {
			 if(str.charAt(i)==st.charAt(j))
			 {   
				 count++;
			 }
			 if(count>1)
				  st.deleteCharAt(j);
		  }
		  System.out.println("Count of "+st.charAt(i)+" is "+count);
		}
		System.out.println(st);
		sc.close();
	}

}
