package com.sp.thread1;

public class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			Thread th=Thread.currentThread();
			System.out.println("----custom Runnable implemented Runnable interface----"+th.getName());
		}
		
	}
	
	

}
