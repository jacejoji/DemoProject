package com.example;
import java.io.PrintStream;
public class Ags {
	public static void main(String[] args) {
		PrintStream ps=new PrintStream(System.out);
		int n=Integer.parseInt(args[0]);
		ps.println(n*n);
	}

}
