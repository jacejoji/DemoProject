package com.example;
import javax.swing.JOptionPane;
public class OorE {
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Enter a number:")); 
		JOptionPane.showMessageDialog(null, (n%2==0?"Number is even":"Number is odd"));
	}
}
