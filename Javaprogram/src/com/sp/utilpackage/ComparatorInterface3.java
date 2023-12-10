package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorInterface3 {

	public static void main(String[] args) {
		TreeSet st=new TreeSet(new StringDescComparator());
		st.add("Manish");
		st.add("Nivas");
		st.add("JLC");
		st.add("JDBC");
		st.add("servelet");
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
class StringDescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			String str1=(String)o1;
			String str2=(String)o2;
			return str1.compareTo(str2);
		}
		
		return 0;
	}
	
}
