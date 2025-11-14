package com.week2;

public class SwitchEx {
	public static void print() {
		switch (1) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		}
	} //print()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Sunday";
		switch(day)
		{
		case "Sunday" -> System.out.println("Today is Sunday");
		case "Monday" -> System.out.println("Today is Monday");
		case "Tuesday" -> System.out.println("Today is Tuesday");
		case "Wednesday" -> System.out.println("Today is Wednesday");
		case "Thursday" -> System.out.println("Today is Thursday");
		case "Friday" -> System.out.println("Today is Friday");
		case "Saturday" -> System.out.println("Today is Saturday");
		default -> System.out.println("Invalid day");
		}
		String result="";
		result=switch(day) {
		case "Sunday"->"Sunday";
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
		print();
		//with yield
		result=switch(day)
		{
		case "Sunday": yield  ("Sunday");
		case "Monday": yield ("Monday");
		default: yield "MOnday";
		};
	}

}
