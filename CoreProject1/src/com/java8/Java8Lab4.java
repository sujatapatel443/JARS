package com.java8;

public class Java8Lab4 {
	public static void main(String[] args) {
		Inter4.show();
		
		//Hello2.show();
		
	}
}

interface Inter4{
	static void show() {
		System.out.println("show--Inter4");
	}
}
class Hello2 implements Inter4{}

