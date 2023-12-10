package com.sp.iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab691 {

	public static void main(String[] args) {
		try(
		FileReader fr=new FileReader("C:\\Sujata\\abc\\Hi.txt");
				
		BufferedReader br=new BufferedReader(fr);
				
	    FileWriter fw=new FileWriter("C:\\Sujata\\abc\\Hi.txt");
				
	    BufferedWriter bw=new BufferedWriter(fw);){
			
			while(true) {
				
				String str=br.readLine();
				
			if(str==null)break;
			
			bw.write(str);
			
			bw.newLine();
				
			}
			bw.close();
			
			System.out.println("Writing completed");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
