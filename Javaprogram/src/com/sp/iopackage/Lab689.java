package com.sp.iopackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Lab689 {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("C:\\Sujata\\abc\\Hi.txt");
				
				InputStreamReader isr=new InputStreamReader(fis);
				
				BufferedReader br=new BufferedReader(isr);){
			
			while(true) {
				String id=br.readLine();
				
				if(id==null)break;
				
				System.out.println(id);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
				

	}

}
