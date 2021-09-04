package com.prasanth.learn;

 public class Student implements Comparable<Student>{
	public int id;
	public String name;
	public int age;
	
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Student st) {
		/*if(st.age==age)
			return 0;
		else if(st.age>age)
		return 1;
		else 
			return -1;*/
		
		return st.name.compareTo(name);
	}

}
 

