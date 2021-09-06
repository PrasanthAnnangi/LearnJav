package com.prasanth.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arl=new ArrayList<String>();
		arl.add("my ");
		arl.add("name ");
		arl.add("prasanth.");
		arl.add(2, "is ");
		
		ArrayList<String>arll=new ArrayList<String>();
		
		arll.addAll(arl);
		arll.add("ahh..okay");
		arll.add("ahh..okay..new commit in git");
		
		
		System.out.println(arll);
		Iterator<String> ar=arl.iterator();
		String str="" ;
		while (ar.hasNext()) {
			str=str+(String) ar.next();
			
		}
		
		System.out.println(str);
		ListIterator<String> lar=arl.listIterator(1);
		String st="";
		
		while (lar.hasNext()) {
			 st =st+ (String) lar.next();
			
		}
		System.out.println(st);
	}

}
