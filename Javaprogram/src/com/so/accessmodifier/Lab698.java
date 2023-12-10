package com.so.accessmodifier;

import java.io.File;
import java.io.IOException;

public class Lab698 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\RajPatel\\Hello.java");
		
		System.out.println("File found :"+file.exists());
		
		System.out.println(file.createNewFile());
		
		System.out.println("File found :"+file.exists());

	}

}




