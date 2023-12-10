package com.sp.thread;

public class ThreadDemo2 {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("group");

		MyThread2 t1 = new MyThread2(tg, "JLC-Thread");

		MyThread2 t2 = new MyThread2();
		//t1.setName("Thread 1");
		//t2.setName("Thread 2");

		t1.start();

		t2.start();

	}

}

class MyThread2 extends Thread {

	MyThread2(ThreadGroup tg, String name) {
		
		super(tg, name);
	}

	MyThread2() {
	}

	public void run() {

		ThreadGroup tg = getThreadGroup();

		int pri = getPriority();

		for (int i = 1; i < 5; i++) {

			System.out.println(i + "\t" + getName() + "\t" + tg.getName() + "\t" + pri);
		}

	}

}
