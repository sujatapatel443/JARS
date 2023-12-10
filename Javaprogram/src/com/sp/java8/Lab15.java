package com.sp.java8;

public class Lab15 {

	public static void main(String[] args) {

		
		Inter3 in = (ab,str) ->{ System.out.println("show(int ,str):" + "\t"+str);
		};
		in.show(77, "sujata");
	}
	

}

interface Inter3 {
	void show(int ab,String sttr);
}
