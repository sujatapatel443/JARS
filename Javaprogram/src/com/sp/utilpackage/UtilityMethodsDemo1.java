package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class UtilityMethodsDemo1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("SriNivas");
		list.add("Dande");
		list.add("Raj");
		list.add("Patel");
		list.add("Sujata");
		list.add("Mother");
		list.add("Anand");
		System.out.println(list);
		System.out.println("-----retriving element by ENUMERATION-------");
		/*
		 * Enumeration enu=Collections.enumeration(list); while(enu.hasMoreElements()) {
		 * Object s=(Object)enu; System.out.println(s); }
		 */
		Vector v=new Vector();
		v.add("Sujata");
		v.add("Sujeet");
		v.add("Rohit");
		v.add("Neha");
		v.add("Mamata");
		Enumeration  en=v.elements();
		List info=Collections.list(en);
		System.out.println(info);
	
		
		
		
	

	}

}
