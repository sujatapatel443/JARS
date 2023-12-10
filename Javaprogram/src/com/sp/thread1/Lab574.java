package com.sp.thread1;

public class Lab574 {

	public static void main(String[] args) {

	}
}

class MyThread2 extends Thread{
	public void run() {
		
		Thread th=
		
		Thread.currentThread();
		System.out.println(th.getName());
	}
}