package com.sp.utilpackage;

import java.util.LinkedHashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(10);
		ls.add(50);
		ls.add("Sujata");
		ls.add(new Long(65));
		ls.add(new Byte((byte)65));
		ls.add(new Integer(65));
		ls.add("A");
		System.out.println(ls);

	}

}
