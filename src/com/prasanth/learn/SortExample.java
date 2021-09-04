package com.prasanth.learn;

import com.prasanth.learn.Student;
import java.util.*;

public class SortExample {
	
	public static void main(String[] args) {
	
		List<Student> t= new ArrayList<Student>();
		
		t.add(new Student(22,"prasanth",25));
		t.add(new Student(21,"vamsi",23));
		t.add(new Student(24,"Prasad",55));
		
		Collections.sort(t); 
	for(Student s:t) {
		System.out.println(s.id+" "+s.name+" "+s.age);
	
	}
	
	t.forEach(System.out::println);
				
	}
}

