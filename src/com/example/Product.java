package com.example;
import java.util.Scanner;
public class Product {
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	double price;
	void display(Product p[]) {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].id);
			System.out.println(p[i].name);
			System.out.println(p[i].price);
		}
	}
void delete(Product p[]) {
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		for (int i = 0; i < p.length; i++) {
			if (p[i].id == id) {
				p[i] = null;
			}
		}	
	}
void update(Product p[]) {
	System.out.println("Enter the id:");
	int id = sc.nextInt();
	for (int i = 0; i < p.length; i++) {
		if (p[i].id == id) {
			System.out.println("Enter the updated name:");
			p[i].name = sc.next();
			System.out.println("Enter the updated price:");
			p[i].price = sc.nextDouble();
		}
	}
}
void search(Product p[]) {
	System.out.println("Enter product name:");
	String name = sc.next();
	for (int i = 0; i < p.length; i++) {
		if (p[i].name.equals(name)) {
			System.out.println(p[i].id);
			System.out.println(p[i].name);
			System.out.println(p[i].price);
		}
	}
}
void basket(Product p[]) {
}
	public static void main(String[] args) {
		Product p[] = new Product[3];
		Product pd = new Product();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			System.out.println("Enter the id:");
			p[i].id = sc.nextInt();
			System.out.println("Enter the name:");
			p[i].name = sc.next();
			System.out.println("Enter the price:");
			p[i].price = sc.nextDouble();
		}
		do {
			System.out.println("Enter the choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				pd.delete(p);
				break;
			case 2:
				pd.update(p);
				break;
			case 3:
				pd.search(p);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (true);
	}

}
