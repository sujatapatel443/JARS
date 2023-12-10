package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab644 {

	public static void main(String[] args) {
		System.out.println("------INFORMATION----");
		Map map=new HashMap();
		map.put("Eid", new Integer(101));
		map.put("Name", "Sujata");
		map.put("Phone", 9125681423l);
		map.put("Email", "sujata.patel44@gmail.com");
		map.put("City", "Banglore");
		Set s=map.keySet();
		Collection  col=map.values();
		System.out.println(s);
		System.out.println(col);
		Map map1=new HashMap();
		map1.put("Eid", new Integer(101));
		map1.put("Name", "Sujata");
		map1.put("Phone", 9125681423l);
		map1.put("Email", "sujata.patel44@gmail.com");
		map1.put("City", "Banglore");
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Map.Entry entry=(Map.Entry)obj;
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"\t"+value);
		}
		System.out.println("-----Adding map as an object in collection-----");
		Collection col1=new ArrayList();
		col1.add(map);
		col1.add(map1);
		System.out.println(col);
		for(Object o:col1) {
			Map m=(Map)o;
			System.out.println(m);
		}
		

	}

}
