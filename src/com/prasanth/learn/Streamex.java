package com.prasanth.learn;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Streamex {
	
	public static void main(String[] args) {
	/*	ArrayList<String> names=new ArrayList<String>();
		
		for (int i = 1; i < 100; i++) {
			
			names.add(i+"  name"+i);
		}
		
		ArrayList<String> streamednames= (ArrayList<String>) names.stream().filter(p->p.contains("0")).collect(Collectors.toList());
		System.out.println(streamednames);
		Set<String>streamednames1=(Set<String>) names.stream().collect(Collectors.toSet());
		System.out.println(streamednames1);*/
		
		/*int i=10;
		String b="11";
		String test="i amgg: prasgganth: Annangi";
		int j= Integer.parseInt(b);
		System.out.println(j);
		System.out.println(Integer.valueOf(b));
		System.out.println(String.valueOf(i));
		System.out.println(j+Integer.valueOf(b)+String.valueOf(i));*/
		int[] arr1= {1,3,5,6,8};
		int[] arr2= {2,4,7,9};
		Set<Integer> ar=new TreeSet<Integer>();
		
		for (Integer itr : arr1) {
			ar.add(itr);
		}
		for (Integer itr1 : arr2) {
			ar.add(itr1);
		}
		
		System.out.println(ar.toString());
		
			ArrayList<Employee> emp=new ArrayList<Employee>();
		
		String[] str= {"11,prasanth,25","22,vamsi,23"};
		for(int k=0;k<str.length;k++) {
		Employee Employee = splitString(str[k]);
		emp.add(Employee);
		
	}
		emp.forEach((n)->System.out.println(n.getId()+n.getName()+n.getAge()) );
		//System.out.println(emp);

	}
	
	private static Employee splitString(String test) {
		// TODO Auto-generated method stub
			String[] arr= test.split(",");
		
		return new Employee(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
		}
	
}
