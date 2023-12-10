package com.sp.utilpackage;

import java.util.Enumeration;
import java.util.Properties;

public class UtilPackageDemo2 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.put("id","102" );
		p.put("Name", "Sujata");
		p.put("Phone", "9125681423");
		System.out.println(p);
		Enumeration en=p.propertyNames();
		while(en.hasMoreElements()) {
			String sn=(String)en.nextElement();
			String  val=p.getProperty(sn);
			System.out.println(sn+"\t"+val);
		}
		

	}

}
