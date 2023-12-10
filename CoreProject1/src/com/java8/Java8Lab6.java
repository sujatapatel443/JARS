package com.java8;

public class Java8Lab6 {
	public static void main(String[] args) {
		int a=5;
		Inter6 i=(c)->{
			System.out.println(c);
			c=c*100;
			System.out.println(c);
			//a=10;
			System.out.println(a);
		};
		i.show(10);
		
		
	}

}

@FunctionalInterface
interface Inter6{
	
	void show(int a);
	
	default void hai() {
		System.out.println("hai---Inter6");
	}
}
