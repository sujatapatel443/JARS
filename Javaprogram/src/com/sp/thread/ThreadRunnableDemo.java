package com.sp.thread;

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		 MyThread1 th=new  MyThread1();

		 Thread t1=new Thread(th);
		 Thread t2=new Thread(th);
		 t1.start();
		 t2.start();
		 Thread thh=Thread.currentThread();
		 for(int i=1;i<=5;i++) {
			 System.out.println(thh.getName()+" -value is :"+i);
		 }try {
			 Thread.sleep(500);
		 }catch(Exception ex) {
			 ex.getStackTrace();
		 }
		 
	}

}
class MyThread1 implements Runnable{
	public void run() {
		Thread t=new Thread();
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName()+" -value is :"+i);
			
		}try {
			Thread.sleep(500);
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
	}
	
	
	
}
