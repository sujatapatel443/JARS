package com.sp.iopackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab693 {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("Welcome.txt");
		
		pw.println(97);
		
		pw.write(97);
		
		pw.println(10.0);
		
		pw.println(true);
		
		pw.println("JLC");
		
		pw.close();
		
		System.out.println(pw);
		
		
		
		
		

	}

}
