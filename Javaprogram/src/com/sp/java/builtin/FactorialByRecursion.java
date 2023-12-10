package com.sp.java.builtin;

// WAP to find out factorial bby using Recursion------

public class FactorialByRecursion {

	public static void main(String[] args) {
		
		Factorial f=new Factorial();
		int n=5;
		long fac=f.factorial(n);
		
		System.out.println("Factorial of "+ n +" is :"+fac);
		
	}

}
class Factorial{
	long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		else return n*factorial(n-1);
		
	}
}

