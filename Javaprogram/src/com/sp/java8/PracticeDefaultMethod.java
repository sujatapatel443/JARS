package com.sp.java8;

public class PracticeDefaultMethod {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.display();
		h.play();
		

	}

}

interface Inter12 {
	default void show() {
		System.out.println("show method in Inter1");
	}

	default void display() {
		System.out.println("display in Inter12");
	}

	default void play() {
		System.out.println("play in Inter12----------------");
	}
}

class Hello implements Inter12 {
	public void show() {
		System.out.println("show in Hello2 class");
	}

	public void display() {
		System.out.println("display in Hello class");

		Inter12.super.display();
	}

	public void play() {
		System.out.println("play in Hello-------");
		Inter12.super.play();
		Inter12.super.show();
	}
}
