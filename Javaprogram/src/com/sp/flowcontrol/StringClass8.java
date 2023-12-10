package com.sp.flowcontrol;

public class StringClass8 {

	public static void main(String[] args) {
		/*
		 * String
		 * str="JLC ,java learning center No.1 java Traiing and Placement .java is a popular language."
		 * ; String str1[]=str.split("java",0);
		 * System.out.println("Length :"+str1.length); for(int i=0;i<str1.length;i++) {
		 * String str2=str1[i]; System.out.println(i+"\t"+str1);
		 * 
		 * String []str3=str1.split("java"); System.out.println("Length :"+str3.length);
		 * for(int j=0;j<str3.length;j++) { String str4=str3[j];
		 * System.out.println(j+"\t"+str3); }
		 * 
		 * String exp="[A-Z]*"; System.out.println("H".matches(exp));
		 * System.out.println("S".matches(exp)); System.out.println("HI".matches(exp));
		 * System.out.println("SRINIVAS".matches(exp));
		 * System.out.println("JLCINDIA".matches(exp));
		 * System.out.println("jlc".matches(exp)); String exp1="[]";
		 * System.out.println("****************************");
		 * System.out.println("jlc".matches(exp1));
		 * System.out.println("JLCindia99".matches(exp1));
		 * System.out.println("99JLCindia".matches(exp1)); String
		 * exp2="^[A-Z][A-Za-z0-9]*"; System.out.println("jlc".matches(exp2));
		 * System.out.println("JLCindia99".matches(exp2));
		 * System.out.println("99JLCindia".matches(exp2));
		 */
		String str1 = "RAJ";
		String str2 = new String("RAJ");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);

	}

}

//}
