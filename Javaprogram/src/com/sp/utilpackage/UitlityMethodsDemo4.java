package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UitlityMethodsDemo4 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sujata");
		list.add("Patel");
		list.add("Anusha");
		list.add("Raj");
		list.add("Pratima");
		list.add("Raman");
		List synchro=Collections.synchronizedList(list);
		System.out.println("Synchronized list is :"+synchro);
		System.out.println("list is :"+list);
		List unmodi=Collections.unmodifiableList(list);
		System.out.println("UnmodifiableList is :"+unmodi);
		synchro.add("Rajat");
		System.out.println(synchro);
		System.out.println("***********************************");
		unmodi.add("Rajat");
		System.out.println(unmodi);

	}

}
