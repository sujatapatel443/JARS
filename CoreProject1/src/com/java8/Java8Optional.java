package com.java8;

import java.util.Optional;

public class Java8Optional {
	public static void main(String[] args) {
		F ref=new F();
		Integer a=null;
		Integer b=500;
		try {
			
			int res=ref.add(a, b);
			System.out.println(res);
			
		}catch(Exception ex) {
			System.out.println("Exception...");
		}
		
		System.out.println("After catch...");
		
		Integer c=null;
		Integer d=125;
		Optional<Integer> e = Optional.ofNullable(c);
		Optional<Integer> f=Optional.of(d);;
		
		int r=ref.addition(e, f);
		System.out.println(r);
		
		System.out.println("Main completed...");
	}
	

}

class F{
	
	int add(Integer a, Integer b) {
		
		return a+b;
	}
	
	int addition(Optional<Integer> i1, Optional<Integer> i2 ) {
	    int i=i1.orElse(0);
	    int j=i2.get();
	    
	    return i+j;
	
	}
	
	
}
