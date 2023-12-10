package com.sp.utilpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet st = new TreeSet();
		st.add(80);
		st.add(10);
		st.add(250);
		st.add(30);
		st.add(60);
		st.add(50);
		System.out.println(st);
		System.out.println("Descending order");
		Set st1 = st.descendingSet();
		System.out.println(st1);
		System.out.println("Assending order");
		Iterator it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println("Descending Iterator");
			Iterator it1 = st.descendingIterator();
			while (it1.hasNext())
				System.out.println(it1.next());
		}

	}

}