package com.sp.thread;

public class ThreadDemo3 {

		public static void main(String[] args) {

			ThreadGroup tg = new ThreadGroup("group");

			MyThread3 mt1 = new MyThread3();
			
			Thread th=new Thread("we");
			
			Thread th1=new Thread("you");
			
			th.setName("Thread 1");
			
			th1.setName("Thread 2");

			th.start();

			th1.start();

		}

	}

	class MyThread3 implements Runnable {

		public void run() {
			
			Thread th=Thread.currentThread();

			ThreadGroup tg =th.getThreadGroup();

			int pri =th.getPriority();

			for (int i = 1; i < 5; i++) {

				System.out.println(i + "\t" + th.getName() + "\t" + tg.getName() + "\t" + pri);
			}
		}
	}



