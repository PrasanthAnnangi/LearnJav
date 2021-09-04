package com.prasanth.learn;

import java.util.*;

public class Hashex {
	
	public static void main(String[] args) {
		
		Set<String> hs= new HashSet<String>();
		
		hs.add(null);
		hs.add("prasanth");
		hs.add("vamsi");
		
		for(String h:hs ) {
			System.out.println(h);
		};
		
Set<String> hs1= new TreeSet<String>();
		
		/*hs1.add(null);*/
		hs1.add("prasanth");
		hs1.add("vamsi");
		
		for(String h:hs1 ) {
			if(h!= null)
			System.out.println(h);
			
		};
	}

}
