package com.prasanth.java8learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEX {
	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		/*Predicate<Integer> predicate=t-> t%2==0;
		System.out.println(predicate.test(10));*/
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		li.stream().filter(t-> t%2==0).forEach((t) -> System.out.println(t));
	}
	
	

}
