package com.prasanth.learn;

import java.util.Scanner;

public class JavLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
String words[];		

System.out.println();
		System.out.println("enter the number of elements");
		int n=Sc.nextInt();
		int[] arry=new int[n];
		
		System.out.println("enter the elements");
		
		for (int i = 0; i < arry.length; i++) {
			
			arry[i]=Sc.nextInt();
			
		}
		System.out.println("Elements you entered: ");
		for (int j = 0; j < arry.length; j++) {
			System.out.println(arry[j]+ "\n");	
			
		}
		
		
		System.out.println("enter the line of strings");
		String str=Sc.next();
		str=Sc.nextLine();
		System.out.println(str);
		words=str.split(" ");
		for (int k = 0; k < words.length; k++) {
			
			System.out.println(words[k]);
			
		}
	}
	

}
