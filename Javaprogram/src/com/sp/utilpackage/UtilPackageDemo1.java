package com.sp.utilpackage;

import java.util.Enumeration;
import java.util.Vector;

public class UtilPackageDemo1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("Mrs");
		v.addElement("Sujata");
		v.addElement("Patel");
		System.out.println(v);
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			Object obj=(Object)en.nextElement();
			System.out.println(obj);
		}
		

	}

}
