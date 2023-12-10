package com.sp.iopackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab690 {

	public static void main(String[] args) {
		
		try(
				
		FileInputStream fis=new FileInputStream("C:\\Sujata\\abc\\Hi.txt");
				
				FileOutputStream fos=new FileOutputStream("C:\\Sujata\\abc\\Hi.txt");){
			
			while(true) {
				int asc=fis.read();
				
				if(asc==-1)break ;
				
					fos.write(asc);
					
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}

	private static void write(int asc) {
		System.out.println();
	}

}
