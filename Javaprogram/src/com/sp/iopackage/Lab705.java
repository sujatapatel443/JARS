package com.sp.iopackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab705 {

	public static void main(String[] args) throws ClassNotFoundException {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\RajPatel\\Hello.java");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			Object obj=ois.readObject();
			System.out.println("Object is deserilized");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		

	}

}
