package com.prasanth.java8learn;

import java.util.*;

public class Calculator {
	 


	public static void main(String[] args) {
		MyFunctionalInterface mfi=()-> System.out.println("Swith on");
		mfi.switchOn();
		List<Books> lb=null;
		
		lb=new ArrayList<>();
		lb.add(new Books(503,"Naruto",100.00f));
		lb.add(new Books(523,"slime",110.00f));
		lb.add(new Books(553,"BlackClover",101.00f));
		lb.add(new Books(451,"OPM",70.00f));
		//1. Normalway
		//Collections.sort(lb, new BookComparebyName());
	/*2. Anonymous class
	 	Collections.sort(lb, new Comparator<Books>(){

		@Override
		public int compare(Books o1, Books o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		});*/
		//3. Lambda method
		Collections.sort(lb, (o1,o2)-> o1.getName().compareTo(o2.getName()));
		System.out.println(lb);
		System.out.println("Stream sortings");
		//lb.stream().sorted((o1,o2)-> o1.getName().compareTo(o2.getName())).forEach(t->System.out.print(t));
		//lb.stream().sorted(Comparator.comparing(book->book.getName())).forEach(t->System.out.print(t));
		lb.stream().sorted(Comparator.comparing(Books::getCost)).forEach(t->System.out.print(t));
		
	}
	
	
}

 /*class BookComparebyName implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	 
 }*/