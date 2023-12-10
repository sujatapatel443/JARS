package com.java8;

public class Java8Lab2 {
	public static void main(String[] args) {
		Hello1 hello1=new Hello1();
		hello1.show();
		
	}
}

interface Inter2{
	default void show() {
		System.out.println("show--Inter2");
	}
}
interface Inter3{
	default void show() {
		System.out.println("show---Inter3");
	}
}
class A implements Inter2{}
class B implements Inter3{}
class Hello1 implements Inter2,Inter3{

	@Override
	public void show() {
		Inter2.super.show();
		Inter3.super.show();
	}}
