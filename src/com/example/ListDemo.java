package com.example;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Emp33> list = new ArrayList<Emp33>(); // <String>
		Emp33 e1 = new Emp33();
		e1.setEmpid(1);
		e1.setName("Tester1");
		e1.setSalary(10000);
		
		Emp33 e2 = new Emp33();
		e2.setEmpid(2);
		e2.setName("Tester2");
		e2.setSalary(20000);
		
		list.add(e1);
		list.add(e2);
		
		System.out.println(list);
		
	}

}
