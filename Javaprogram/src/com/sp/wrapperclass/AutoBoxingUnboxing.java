package com.sp.wrapperclass;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		Integer i1=127;
		Integer i2=127;
		System.out.println(i1==i1);
		Integer i3=new Integer(i2);
		Integer i4=new Integer(i2);
		System.out.println(i3==i4);
		Character ch1='A';
		Character ch2='A';
		System.out.println(ch1==ch2);
		Character ch3=(char)171;
		Character ch4=(char)171;
		System.out.println(ch3==ch4);
		Float f1=12.23F;
		Float f2=12.23F;
		System.out.println(f1==f2);
		Double d1=12.23;
		Double d2=12.23;
		System.out.println(d1==d2);
		Integer in1=596;
		Integer in2=596;
		System.out.println(in1==in2);
		in1++;
		System.out.println(in1==in2);
		Long val1=128L;
		Long val2=128L;
		System.out.println(val1==val2);
		
		
		

	}

}
