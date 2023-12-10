package com.corejava.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat1 {

	public static void main(String[] args) {
		
		double d=123.456;
		NumberFormat nf=NumberFormat.getInstance(Locale.CANADA);
		
		System.out.println("Canada format is: "+nf.format(d));
		
		//WAP a program to print a java number in India, UK, US, and Italy currency format:
		
		double d1=123456.789;
		Locale INDIA =new Locale("pa","IN");
		NumberFormat nf2=NumberFormat.getCurrencyInstance(INDIA);
		System.out.println("India notation is: "+nf.format(d1));

	}

}
