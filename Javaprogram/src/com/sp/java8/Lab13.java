package com.sp.java8;

public class Lab13 {

	public static void main(String[] args) {
		
		Runnable r=()->{
			System.out.println("Welcome to JLC");
			
			System.out.println("Welcome to java learning center---");
		};
		Thread t=new Thread(r);
		t.start(); 
		
		Inter1 in=new Inter1() {

			@Override
			public void show() {
				System.out.println("show()--");
				
			}
			
		};
		in.show();
		
		System.out.println("*******************");

		int ab=20;
		Inter2 i=()->
			System.out.println("show():"+ab);
			i.show();
			
		
		
	
	}

}

interface Inter1 {
	void show();
}
interface Inter2{
	void show();
}
