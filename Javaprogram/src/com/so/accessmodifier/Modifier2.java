package com.so.accessmodifier;

public class Modifier2 {
	int a=30;
	String str="Sujata";
	{
	System.out.println("Hello instance Block");	
	}
	static {
		System.out.println("Hello static Block");
	}
	void add() {
		int b=10;
		int c=15;
		System.out.println("Result of b+c is-> "+(b+c));
	}


	

}
