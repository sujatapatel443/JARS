package com.sp.logicalprogram;

public class FnuctionalInterface {

	public static void main(String[] args) {
		
		int a=20;
		
		//System.out.println("Hai Interf1-----");
		Interf1 Interf1=()->System.out.println("show nmethos of Interf1----"+a);
		Interf1.show();

	}

}
interface Interf1{
	void show();
}
