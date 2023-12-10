package com.java8;

interface Inter1 {
	int a=10;
	
	default void process() {
		System.out.println("process()----Inter1");
	}
	
	default void show() {
		System.out.println("show()----Inter1");
	}

}
class Hello implements Inter1{
	int a=100;
	public void process() {
		System.out.println("process()----Hello");
		//Inter1.super.process();
	}
}
public class Java8Lab1{
	public static void main(String[] args) {
		Inter1 h=new Hello();
		System.out.println(h.a);
		h.process();
		h.show();
		System.out.println(Inter1.a);
		
	}
}
