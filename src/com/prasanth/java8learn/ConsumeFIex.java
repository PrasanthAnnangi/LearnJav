package com.prasanth.java8learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeFIex {

	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer=(t)->System.out.println(t); consumer.accept(10);
		 * List<Integer> li= Arrays.asList(1,2,3,4,5); li.stream().forEach(consumer);
		 */
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		li.stream().forEach((t) -> System.out.println(t));
	}
}
