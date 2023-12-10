package com.sp.utilpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab645 {

	public static void main(String[] args) {
		System.out.println("-----Information by Hashmap-------");
		Map map=new HashMap();
		map.put("Name", "Sujata");
		map.put("Eid", 101);
		map.put("Phone", 9452635878l);
		map.put("Email", "sujata.patel443mail.com");
		map.put("Address", "Robertsganj");
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("---------Information by LinkedHashMap-------");
		Map map1=new LinkedHashMap();
		map1.put("Name", "Sujata");
		map1.put("Eid", 101);
		map1.put("Phone", 9452635878l);
		map1.put("Email", "sujata.patel443mail.com");
		map1.put("Address", "Robertsganj");
		Set set1=map1.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()) {
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("------Information by TreeMap------");
		Map map2=new TreeMap();
		map2.put("Name", "Raj");
		map2.put("Eid", 102);
		map2.put("Phone", 9452635877l);
		map2.put("Email", "raj.patel443mail.com");
		map2.put("Address", "Robertsganj");
		Set set2=map2.entrySet();
		Iterator it2=set2.iterator();
		while(it2.hasNext()) {
			Object obj=it2.next();
			System.out.println(obj);
		}



	}
	

}
