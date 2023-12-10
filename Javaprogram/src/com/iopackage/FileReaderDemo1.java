package com.iopackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		//File file =new File("C:\\Users\\RajPatel\\abc.txt");
		/*
		 * FileWriter fw=new FileWriter(file,true); fw.write("Hello all");
		 * fw.write("\nSujata Patel"); fw.flush(); fw.close();
		 * 
		 * 
		 */
		//For reading Data from flie
		FileReader fr=new FileReader("C:\\Users\\RajPatel\\abc.txt");
		BufferedReader br =new BufferedReader(fr);
		String a=br.readLine();
		while(a!=null) {
			System.out.println((String)a);
			a=br.readLine();
		}
		br.close();
	}

}
