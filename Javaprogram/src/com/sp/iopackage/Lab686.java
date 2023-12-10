package com.sp.iopackage;

import java.io.BufferedInputStream;

public class Lab686 {

	public static void main(String[] args) {
		
		System.out.println("Enter data");
		
		try(BufferedInputStream bis=new BufferedInputStream(System.in) ){
			
			while(true) {
				
				int asc= bis.read();
				
				if(asc==13)break;
				
				char ch=(char)asc;
				
				System.out.print(ch);
			}
			
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			
			
		}

	}

}
