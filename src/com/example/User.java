package com.example;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class User {
	public static void main(String[] args) {
		Dog d=new Dog();
	d.eat();
 	d.main(null);
 	JButton jb=new JButton("Click me!");
 	String name=JOptionPane.showInputDialog("Ënter a number:");
 	int a=Integer.parseInt(name);
 	int b=Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
 	JOptionPane.showMessageDialog(null, "Hello "+a+" + "+b+" is "+(a+b));
 	JOptionPane.showOptionDialog(jb, jb, name, 0, 0, null, args, name);
 	
	}
}
