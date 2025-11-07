package com.example;

public class InvalidAgeException extends Exception {
	int age;
	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException(String message, int age) {
		super(message);
		this.age = age;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [age=" + age + "]";
	}
}
