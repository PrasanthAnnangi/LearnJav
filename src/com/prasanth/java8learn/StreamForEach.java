package com.prasanth.java8learn;

import java.util.*;

public class StreamForEach {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(15);
		list.add(16);
		
		
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
//		list.stream().forEach(t->System.out.println(t));
		
		System.out.println("Assending");
		list.stream().sorted().forEach(t->System.out.println(t));
		System.out.println("Descending");
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		System.out.println("normal list");
		list.stream().forEach(t->System.out.println(t));
		
		
		
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1, "prasanth");
		mp.put(2, "2");
		mp.put(3, "prasanth3");
		mp.put(4, "prasanth4");
		
		mp.entrySet().stream().forEach(t-> System.out.println(t.getKey()+" "+t.getValue()));
		
		mp.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t-> System.out.println(t.getKey()+" "+t.getValue()));
		mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t->System.out.println(t.getKey()+" -> "+t.getValue()));
	}
	

}
