package com.sp.logicalprogram;

public class SwapOfTwoNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int n1=3;
		int n2=5;
		System.out.println("Before swaping ->n1 = "+n1+","+" n2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swaping ->n1 = "+n1+","+" n2 = "+n2);

	}

}
