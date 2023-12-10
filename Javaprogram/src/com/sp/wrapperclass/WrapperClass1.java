package com.sp.wrapperclass;

public class WrapperClass1 {

	public static void main(String[] args) {
		int a=20;
		Integer in =new Integer(20);
		Integer inn =new Integer(a);
		System.out.println(inn);
		System.out.println(in);
		byte b=40;
		Byte by=new Byte(b);
		System.out.println(by);
		double d=50.0;
		Double d1=new Double(d);
		System.out.println(d1);
		char ch='A';
		Character c=new Character(ch);
		System.out.println(c);
		boolean bo=true;
		Boolean boo=new Boolean(bo);
		System.out.println(boo);
		boolean bo1=boo.booleanValue();
		System.out.println(bo1);
		char chh=c.charValue();
		System.out.println(chh);
		byte b2=by.byteValue();
		System.out.println(b2);
		Float f1=new Float(45.0);
		byte by1=f1.byteValue();
		System.out.println(by1);
		String str="1234";
		Integer i=new Integer(str);
		System.out.println(i);
		Byte b3=new Byte("123");
		System.out.println(b3);
		Boolean bu=new Boolean("true");
		String srt4=bu.toString();
		System.out.println(srt4);
		System.out.println(bu);
		int e=10;
		String s1=Integer.toString(e);
		System.out.println(s1);
		
		Integer i1=new Integer(s1);
		System.out.println(i1);
		Byte by2=123;
		Byte by3=123;
		System.out.println(by2==by3);
		byte b6=123;
		Byte by4=new Byte(b6);
		Byte by5=new Byte(b6);
		System.out.println(by4==by5);
		System.out.println(by3==by4);
		
		
		
		
		
		
		
		
		
		
		}

}
