package com.iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {

	public static void main(String[] args)throws IOException  {
		
		/*
		 * FileWriter fw=new FileWriter("C:\\Users\\RajPatel\\abc.txt"); BufferedWriter
		 * bw=new BufferedWriter(fw); bw.newLine(); bw.write('c'); bw.newLine();
		 * 
		 * bw.write("Anusha is sleeping"); bw.newLine(); char[] ch=
		 * {'a','b','d','e','f'}; bw.write(ch); bw.flush();
		 */
		
		//Reading data from file
		FileReader fr=new FileReader("C:\\Users\\RajPatel\\abc.txt");
		BufferedReader bfr=new BufferedReader(fr);
		String str=bfr.readLine();
		while(str!=null) {
			System.out.println(str);
			str=bfr.readLine();
		}
		
		

	}

}
