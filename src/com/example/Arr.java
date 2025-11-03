package com.example;
import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		int marks[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int c=0;
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter a mark:");
				marks[i]=sc.nextInt();
				 if(marks[i]<40) 
					c++;
				if(c>=2) 
					System.out.println("Failed two or more subjects");
			}
			for(int m:marks)
			System.out.println(m);
			int n[][]=new int[5][5];
			for(int i=0;i<n.length;i++)
			{
				for(int j=0;j<n.length;j++)
				{
					System.out.println("Enter mark:");
					n[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n.length;i++)
			{
				for(int j=0;j<n.length;j++)
				{
					System.out.print(n[i][j]+"/t");
					
				}
				System.out.println();
			}
			
			sc.close();
	}

}
