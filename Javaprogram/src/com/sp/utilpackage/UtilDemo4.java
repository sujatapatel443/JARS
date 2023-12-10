package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;

public class UtilDemo4 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Madhuri");
		col.add("Aadriti");
		col.add("Devansh");
		col.add("Anusha");
		col.add("Abhishek");
		System.out.println(col.isEmpty());
		System.out.println(col.contains("Madhuri"));
		col.add("java");
		System.out.println(col);
		System.out.println(col.contains("java"));
		System.out.println("size : "+col.size());
		System.out.println(col.remove("Devansh"));
		System.out.println(col);
		Object obj[]=col.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
			obj[i]="JLC";
			System.out.println("size: "+col.size());
			System.out.println(obj[i]);
			System.out.println(col);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
		}
		System.out.println(col);
		
	}

}
