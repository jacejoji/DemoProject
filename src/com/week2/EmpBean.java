package com.week2;

public class EmpBean {
	public static void main(String[] args) {
		Emp e = new Emp(101, "John Doe", 50000); 
		System.out.println(e);
	}
}

record Emp(int id, String name, double salary) {
	
}
