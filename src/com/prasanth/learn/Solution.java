package com.prasanth.learn;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 
     
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc= new Scanner(System.in);
   String s=sc.next();
        char[] ch=new char[100];
        		ch=s.toCharArray();
        System.out.println(ch);
        int i=ch.length;
        char ch2;
      
        int max=0;
        char ch3=1;
        
        for(int j=0;j<i;j++){
        	 ch2=ch[j];
        	 int mx=0;
        	 for(int k=j+1;k<i;k++) {
            if(ch2==ch[k]) {
            	mx=mx+1;
            }
           
        	 }
        	 
        	 if(max<mx) {
        		 max=mx;
        		 ch3=ch2;
        	 }
        	 else if(max==mx) {
        		 if(ch3==1) {
        		ch3=ch2;
        		 }
        		 else if(ch2<ch3)
        			 ch3=ch2;
        	 }
        }
           /* if(tm.containsKey(Character.valueOf(ch2))) {
            	
            	for(Map.Entry<Character,Integer> mp:tm.entrySet()) {
            		if(mp.getKey()==(Character.valueOf(ch2))) {
            			Integer temp=mp.getValue()+1;
            			mp.setValue(temp);
            		}
            		
            	}
            }
            else {
            	tm.put(Character.valueOf(ch2),1);
            }
        }
        
        for(Map.Entry<Character,Integer> g:tm.entrySet())
        System.out.println(g.getKey()+" "+g.getValue());
    */
        System.out.println((char)ch3+" "+max);
    }
    

}