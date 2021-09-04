package com.prasanth.learn;

import java.util.Scanner;
import java.util.StringTokenizer;

public class javaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s=new String("test1");
		s.concat(" changed");
		StringBuilder sb= new StringBuilder("test");
		sb.append("changed");
		
		System.out.println("test1 "+s+" test "+sb);
		StringBuilder sb2=sb;
		sb2.deleteCharAt(3);
		System.out.println(sb+"  "+sb2);
		
		
		
		String sts="My name is prasanth";
		StringTokenizer st= new StringTokenizer(sts);
		int count=st.countTokens();
		String strr[]=new String[count];
		int l=0;
		while (st.hasMoreTokens()) {
			strr[l] = (String) st.nextToken();
			l++;
		}
		for (int i = 0; i < strr.length; i++) {
			System.out.println(strr[i]);	
		}
		
		
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the text");
		String str1=sc.next();
		int n=str1.length();
		char starr[]=new char[n];
		
		for (int i = 0; i < str1.length(); i++) {
			
			starr[i]=str1.charAt(i);
			System.out.print(starr);
			
			for (int j = i+starr.length; j < (2*str1.length())-starr.length; j++) {
				System.out.print("  ");
			}
			
			System.out.println();
		}

	}

}
