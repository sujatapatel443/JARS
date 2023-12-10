package com.sp.iopackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lab687 {

	public static void main(String[] args) {
		try
		(FileInputStream fis=new FileInputStream("C:\\Sujata\\abc\\Hi.txt");
				
				BufferedInputStream bis=new BufferedInputStream(fis);){
			
			while(true){
				
				int asc=bis.read();
				
				if(asc==-1) break;
				
				char ch=(char)asc;
				
				System.out.print(ch);
					
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
				
	}

}
