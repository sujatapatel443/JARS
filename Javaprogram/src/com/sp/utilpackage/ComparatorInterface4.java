package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorInterface4 {

	public static void main(String[] args) {
		System.out.println("----Iteration by SBComparator----");
		TreeSet st=new TreeSet(new SBComparator());
		st.add(new StringBuilder("Manish"));
		st.add(new StringBuilder("Nivas"));
		st.add(new StringBuilder("JLC"));
		st.add(new StringBuilder("JDBC"));
		st.add(new StringBuilder("servelet"));
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
class SBComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof StringBuilder && o2 instanceof StringBuilder) {
			String str1=o1.toString();
			String str2=o2.toString();
			return str1.compareTo(str2);
		}
		
		return 0;
	}

}
