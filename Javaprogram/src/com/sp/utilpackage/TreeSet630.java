package com.sp.utilpackage;

import java.util.TreeSet;

public class TreeSet630 {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add(5);
		ts1.add(2);
		ts1.add(6);
		ts1.add(10);
		ts1.add(8);
		ts1.add(5);
		ts1.add(12);
		ts1.add(15);
		System.out.println(ts1);
		System.out.println(ts1.pollFirst());
		System.out.println(ts1);
		System.out.println(ts1.pollFirst());
		System.out.println(ts1.pollLast());
		System.out.println("Lower () ");
		System.out.println(ts1.lower(5));
		System.out.println(ts1.lower(9));
		System.out.println(ts1.lower(8));
		System.out.println(ts1);
		System.out.println(ts1.lower(6));
		System.out.println("Higher ()");
		System.out.println(ts1.higher(5));
		System.out.println(ts1.higher(11));
		System.out.println(ts1.higher(12));
		System.out.println("Ceiling ()");
		System.out.println(ts1.ceiling(8));
		System.out.println(ts1.ceiling(9));
		System.out.println("Floor ()");
		System.out.println(ts1.floor(9));
		System.out.println(ts1.floor(11));
		

	}

}
