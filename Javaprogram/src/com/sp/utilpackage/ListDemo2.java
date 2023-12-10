package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo2 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Sujata");
		v.add("Raj");
		v.add("Anusha");
		v.add("Seema");
		v.add("Sri");
		v.add("Nivas");
		System.out.println(v);
		Enumeration e=v.elements();
		if(e.hasMoreElements())
		System.out.println(e.nextElement());
		System.out.println("Main completed");
		
	}

}
