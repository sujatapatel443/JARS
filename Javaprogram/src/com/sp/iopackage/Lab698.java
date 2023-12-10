package com.sp.iopackage;

import java.io.File;

public class Lab698 {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Test.java");
		
		System.out.println("File found:"+f.exists());
		
		f.createNewFile();
		
		System.out.println(f.exists());
		
		
		

	}

}
