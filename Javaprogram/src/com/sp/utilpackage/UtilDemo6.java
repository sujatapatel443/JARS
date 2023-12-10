package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;

public class UtilDemo6 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("sri");
		col.add("Nivas");
		col.add("Dande");
		col.add("JAVA");
		col.add("JDBC");
		col.add("JSP");
		Collection col2=new ArrayList();
		col2.add("java");
		col2.add("jdbc");
		col2.add("jsp");
		Collection col3=new ArrayList();
		col3.add("Java");
		col3.add("Ejb");
		col3.add("Jlc");
		System.out.println(col+"\t"+col2+"\t"+col3+"size: "+col3.size());
		System.out.println(col.containsAll(col2));
		System.out.println(col.addAll(col2));
		System.out.println(col.containsAll(col2));
		System.out.println(col.containsAll(col3));
		System.out.println(col.addAll(col3));
		System.out.println("size: "+col.size());
		System.out.println(col);
		System.out.println(col.retainAll(col3));
		System.out.println(col+"*********************");
		System.out.println(col.retainAll(col2));
		System.out.println(col);
		System.out.println("*************************");
		System.out.println(col.retainAll(col3));
		System.out.println(col.isEmpty());

	}

}
