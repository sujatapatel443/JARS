package com.sp.thread1;

public class ThreadClint {

	public static void main(String[] args) {
		
		MyThread1 mt1=new MyThread1();
		
		MyThread1 mt2=new MyThread1();
		
		//mt1.start();  mt2.start();
		
		mt1.run();   mt2.run();
		
		
		  Thread t=Thread.currentThread();
		  
		  System.out.println(t.getName()+"\t"+t.getState());
		 
		
		//t.run();
		
		for(int i=1;i<=4;i++) {
			System.out.println("---main Thread----");
			
		}
	 

	}

}
