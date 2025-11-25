package com.example;

import java.util.ArrayList;

class Laptop {
	public Laptop(String string, int i) {
		// TODO Auto-generated constructor stub
		brand=string;
		price=i;
	}
	String brand;
	int price;
}

public class ListStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> l=new ArrayList<Laptop>();
		l.add(new Laptop("HP",10000));
		l.add(new Laptop("Dell",20000));
		l.add(new Laptop("Lenovo",30000));
		l.add(new Laptop("Asus",40000));
		l.add(new Laptop("Acer",50000));
		l.add(new Laptop("Apple",60000));
		l.add(new Laptop("HP",70000));
		l.add(new Laptop("Dell",80000));
		l.add(new Laptop("Lenovo",90000));
		l.add(new Laptop("Asus",100000));
		l.add(new Laptop("Acer",110000));
	}

}
