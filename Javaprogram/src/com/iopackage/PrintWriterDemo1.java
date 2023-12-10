package com.iopackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		
		  FileWriter fw=new FileWriter("C:\\Users\\RajPatel\\abc.txt"); PrintWriter
		  pw=new PrintWriter(fw); pw.write("core java  is completed");
		  pw.println(100);
		  pw.print('s');
		  pw.println(30);
		  
		  pw.write("\nAnnusha is daughter of Sujata Patel"); pw.flush();
		 
		
		
		
	}

}
