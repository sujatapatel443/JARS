package com.java8;

public class Java8Lab5 {
	public static void main(String[] args) {
		Hello3 h=new Hello3();
		h.show("RAJ");
	}

}
class Hello3{
	int name=100;
	void show(Hello3 this, String name) {
		System.out.println(name);
		System.out.println(this.name);
	}
}

class Abc{}
