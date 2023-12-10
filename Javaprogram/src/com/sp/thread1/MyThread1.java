package com.sp.thread1;

public class MyThread1 extends Thread{
	
	public void run() {
		Thread th=new Thread();
		
		th.currentThread();
		
		for(int i=0;i<=4;i++) {
			System.out.println(th.getName()+"\t"+th.getState());
		}
	}

}
