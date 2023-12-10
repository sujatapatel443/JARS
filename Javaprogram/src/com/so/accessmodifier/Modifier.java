package com.so.accessmodifier;

import com.sp.flowcontrol.Hello;

final class Modifier {

	public static void main(String[] args) {
		final int a=10;
		long l=20l;
		Hello h=new Hello();
		h.show1();
		Modifier.show();
		Modifier2 m2=new Modifier2();
		m2.add();
		System.out.println(m2.str.hashCode());
		System.out.println(m2.str.charAt(3));
		System.out.println(m2.str.toCharArray());
		System.out.println(m2.toString());
		System.out.println(m2.equals(h));
		System.out.println(m2.str.length());
		System.out.println(m2.str.intern());
		System.out.println(m2.getClass());
		System.out.println(m2.str.compareTo("sujata"));
		System.out.println(m2.str.compareToIgnoreCase("sujata"));
		System.out.println(m2.str.concat("Raj"));
		System.out.println(m2.str.contentEquals("  sujata  "));
		System.out.println(m2.str.trim());
		System.out.println(m2.str.codePointCount(2, 5));
		
		
		
		
		
		

	}
	private static  void show() {
		System.out.println("Hello show method");
	}
	//abstract void show1();
	{
		
	}
	static {
		
	}
	
		
	

}
