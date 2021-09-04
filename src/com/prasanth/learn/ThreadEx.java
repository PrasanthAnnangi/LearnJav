package com.prasanth.learn;

public class ThreadEx  extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
	}

	static void display(String... values){
		String sd="";
		for (String s: values)
		
		sd+=s+" ";
		
	    sd.trim();
		
		
		System.out.println(sd.trim()+".");
		
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEx te=new ThreadEx();
		te.start();
		te.display("my","name","prasanth");

	}

}
