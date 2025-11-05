package com.example;

public abstract class Car {
	public final void color() {
		System.out.println("Color is red");
	}
	public static void Brand() {
		System.out.println("Brand is BMW");
	}
	public abstract void model();
	public abstract void price();
	public abstract void speed();
}
