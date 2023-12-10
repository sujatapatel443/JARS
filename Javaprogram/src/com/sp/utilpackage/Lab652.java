package com.sp.utilpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab652 {

	public static void main(String[] args) { 
		Map <Integer,String>map=new LinkedHashMap<Integer,String>();
		map.put(105, "Mrs");
		map.put(103, "Sujata");
		map.put(106, "Patel");
		map.put(104, "Anusha");
		Set<Map.Entry<Integer,String>>set=map.entrySet();
		Iterator<Map.Entry<Integer,String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String>entry=it.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"\t"+value);
		}

	}

}
