package com.sp.java8;

public class PracticeOfJava8_2 {

	public static void main(String[] args) {
		G g=new G();
		g.show();
		
		//Inter14.super.show();

	}

}
interface Inter14{
	default void show() {
		System.out.println("show in Inter14-------");
	}
}
interface Inter15{
	default void show() {
		System.out.println("show in Inter15-------");
	}
}
class G implements Inter14,Inter15{
	public void show() {
		System.out.println("show in G class-------");
		Inter14.super.show();
		Inter15.super.show();
	}
}
