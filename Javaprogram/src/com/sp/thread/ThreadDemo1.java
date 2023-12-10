package com.sp.thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		 MyThread t1=new  MyThread("Therad 1" );
		 MyThread t2=new  MyThread("Therad 2" );
		 MyThread t3=new MyThread("Therad 3" );
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		 //public final void setName("Thread t1")
		 t1.start();
		 t2.start();
		 t3.start();
		 Thread th=Thread.currentThread();
		 for(int i=1;i<=5;i++) {
			 System.out.println(th.getName()+"-value is :"+i);
			 try {
				 Thread.sleep(500);
			 }catch(Exception ex) {
				ex.printStackTrace();
			 }
			 
			 
		 }
		

	}

}
class MyThread extends Thread{
	MyThread(){
		System.out.println("Thread name is :"+getName());
	}
	
	public MyThread(String string) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Thread t=new Thread();
		for(int i=1;i<=5;i++) {
			System.out.println(t.getName()+"-value is :"+i);
			try {
				Thread.sleep(500);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
	}
}
