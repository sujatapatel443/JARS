package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
	
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	       
	    }
	 
	 public static int sqr(int a) {
		 
		 return a*a;
	 }
	 
	 public float add(float a, int b) {
		 System.out.println("add(.......)");
		 return a+b;
	 }
	 
	 public static void main(String[] args) {
		 Sayable refSayable=MethodReference::saySomething;
		// refSayable.say();
		 
		 R abcRef=MethodReference::saySomething;
		 abcRef.abc();
		 
		 MethodReference methodReference=new MethodReference();
		 S sRef=methodReference::add;
		 System.out.println(sRef.a(100,200));
		 
		 BiFunction<Float, Integer, Float>adder = methodReference::add;
		 System.out.println(adder.apply(100f, 100));
		 
		 Function<Integer, Integer> fun=MethodReference::sqr;
		 System.out.println(fun.apply(8));
		
	}

}

interface Sayable{  
    void say(); 
   
} 
interface R{
	void abc();
}
interface S{
	float a(float a, int b);
}
