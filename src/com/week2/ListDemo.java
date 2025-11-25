package com.week2;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public  static void print(String s) {
		System.out.println(s);
	}
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); // List
		list.forEach(System.out::println); // Consumer using method reference
	String names[]= {"Rohit","Rahul","Virat","Dhoni","Kohli"};
	Arrays.stream(names).forEach(ListDemo::print);
}

}
