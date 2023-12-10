package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;

public class UtilDemo3 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		System.out.println(col);
		System.out.println("size : "+col.size());
		System.out.println("Empty : "+col.isEmpty());
		col.add(null);
		System.out.println(col);
		col.add("Sujata");
		col.add("Patel");
		col.add("Aunsha");
		System.out.println(col);
		System.out.println("size is : "+col.size());
		System.out.println("Empty : "+col.isEmpty());
		System.out.println(col.remove(null));
		System.out.println(col);
		

	}

}
