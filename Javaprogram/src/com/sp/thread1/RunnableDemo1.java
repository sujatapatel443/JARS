package com.sp.thread1;

public class RunnableDemo1 {

	public static void main(String[] args) {
		
		MyRunnable1 mr1=new MyRunnable1();
		Thread t=new Thread(mr1);
		Thread t1=new Thread(mr1);
		t.start(); t1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	     
		System.out.println("Implementation of Runnable interface by using Lambda Expression----");
		
		Runnable rt=()->{
			for(int i=1;i<=5;i++) {
				Thread th=Thread.currentThread();
				
				System.out.println("----custom Runnable implemented Runnable interface----"+th.getName());
			}
		};
		new Thread(rt).start();
		
		
		/*
		 * Ab r=(a)->{ System.out.println("Ab Interface:"+a); };
		 * 
		 * r.show(3);
		 */
		 	}

}
