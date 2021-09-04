package com.prasanth.learn;

import java.util.*;

public class MApEx {
	public static void main(String[] args) {
		Map<Integer,String> mp= new HashMap<Integer,String>();
		Hashtable<Integer, HashMap<Integer, String>> hs= new  Hashtable<Integer, HashMap<Integer, String>>();
		mp.put(3,"prasanth");
		mp.put(2,"vamsi");
		mp.put(1, "Prasad");
		
		
		System.out.println(mp.entrySet());
		for(Map.Entry<Integer, String> m: mp.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(mp);
		for(Map.Entry<Integer, String> m: tm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		hs.put(101, (HashMap<Integer, String>) mp);
		System.out.println(hs.entrySet());
		
		for(Map.Entry<Integer, HashMap<Integer, String>> hm: hs.entrySet() ) {
			System.out.println(hm.getKey()+" "+hm.getValue());
			
		}
		
		
		
	}

}
