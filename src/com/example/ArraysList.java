package com.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(10,20,30,40,50);
		Stream<Integer> s=l.stream();
		s.forEach(num->System.out.println(num));
		l.forEach(num->System.out.println(num));
	}

}
