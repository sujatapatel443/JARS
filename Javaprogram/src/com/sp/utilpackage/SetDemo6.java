package com.sp.utilpackage;

import java.util.TreeSet;

public class SetDemo6  {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(25);
		System.out.println(ts);
		System.out.println("subset() method");
		System.out.println(ts.subSet(5,15));
		System.out.println(ts.subSet(10,20 ));
		System.out.println(ts.subSet(5, false,15,true));
		System.out.println("headset ()");
		System.out.println(ts.headSet(10));
		System.out.println(ts.headSet(17));
		System.out.println(ts.headSet(11,true));
		System.out.println(ts.headSet(2));
		System.out.println("tailSet () ");
		System.out.println(ts.tailSet(21));
		System.out.println(ts.tailSet(10));
		System.out.println(ts.tailSet(4));
		
	}

}
