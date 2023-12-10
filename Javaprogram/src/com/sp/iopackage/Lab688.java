package com.sp.iopackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab688 {

	public static void main(String[] args) {
		
		try(InputStreamReader isr=new InputStreamReader(System.in);
				
				BufferedReader br=new BufferedReader(isr);){
			
			System.out.println("Enter id");
			
			String id=br.readLine();
			
			System.out.println("Enter name");
			
			String name=br.readLine();
			
			System.out.println(id+"\t"+name);
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
				
				
				
				
				

	}

}
