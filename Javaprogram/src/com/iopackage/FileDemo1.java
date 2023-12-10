package com.iopackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\RajPatel\\abc.txt");
		f.createNewFile();
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		File f1=new File("sujata1234");
		f1.mkdir();
		System.out.println(f1.isDirectory());
		
		System.out.println("******************************");
		 String currentPath = new java.io.File(".").getCanonicalPath();
		 System.out.println("Current dir:" + currentPath);

		 String currentDir = System.getProperty("user.dir");
		 System.out.println("Current dir using System:" + currentDir);
		 File f2=new File("AnushaPatel123",".txt");
		 f2.mkdir();
		 System.out.println(f2.isFile());
		 System.out.println(f2.isDirectory());
		 System.out.println();
		 f2.createNewFile();
		 FileWriter fw=new FileWriter("C:\\SUJATA_WORK\\Javaprogram\\AnushaPatel123\\abc.txt",true);
		 String s="I am solving io problem in c directory";
		 
		 fw.write(s);
		 char[] ch={'a','b','c','d'};
		 fw.write("\n"+ch);
		 fw.flush();
		 fw.close();
		 
		 
		
		
		
		
		
		

	}

}
