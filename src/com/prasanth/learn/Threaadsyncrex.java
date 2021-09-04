package com.prasanth.learn;


class Test{
	synchronized void printTable(int j){
		for (int i = 1; i <6; i++) {
			
			System.out.println(i*j);
			
			try {
				Thread.sleep(400);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}

class Thread2 extends Thread{
	
	Test t;
	public Thread2(Test t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
	public void run() {
		t.printTable(5);
	}
	
}

class Thread1 extends Thread{
	
	Test t;
	public Thread1(Test t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	
	public void run() {
		t.printTable(100);
	}
	
}
public class Threaadsyncrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Thread1 t1= new Thread1(t);
		Thread2 t2= new Thread2(t);
		t1.start();
		t2.start();
		

	}

}
