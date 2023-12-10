package com.sp.java.builtin;

public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai=new Hai(20);
		Hello h1=new Hello(10,hai);
		Hello h2=(Hello) h1.Clone();
		h1.show();
		h2.show();
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);
		h2.y=50;
		h2.hai.x=123;
		h1.show();
		h2.show();
			
		

	}

}
class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y=y; 
		this.hai=hai;
	}
	void show() {
		System.out.println("Hello y->"+y);
		System.out.println("Hello hai->"+hai);
	}
	public Object  Clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
		
	
}
