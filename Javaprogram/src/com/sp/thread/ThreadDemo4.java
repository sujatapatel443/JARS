package com.sp.thread;

public class ThreadDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread4 th=new MyThread4();
		
		Thread t1=new Thread(th);
		
		System.out.println(t1.getState());
		
		t1.start();
		
		Thread.sleep(500);
		
		System.out.println(t1.getState());
		
		Thread.sleep(5000);
		
		System.out.println(t1.getState());
	}

}
class MyThread4 extends Thread{
	
	public void run() {
		
		Thread th=Thread.currentThread();
		
		for(int i=1;i<5;i++) {
			
			System.out.println(th.getName()+"\t"+" - value is :"+i+"\t"+th.getState());
			
			try {
				
				Thread.sleep(500);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
	}
	
}
