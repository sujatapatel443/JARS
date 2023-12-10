package com.sp.flowcontrol;

public class ExceptRetu {
	
	public static void main(String[] args) {
		
		System.out.println(show());
		
		System.out.println("Hello Interf");
		int a=10;
		Interf interf=()->
			System.out.println("show() method: "+a);
			interf.show();
		

		
	}
	static int show() {
		int a=0;
		try {
			a=10;
		int b=	a/0;
			return a;
		}catch(Exception ex) {
			a=5;
			return a;
		}
		finally {
			System.out.println("Hello finally----");
		}
	}
	
}

@FunctionalInterface
interface Interf{
	void show();
}


