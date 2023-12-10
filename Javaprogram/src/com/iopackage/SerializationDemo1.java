package com.iopackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Elephant e1=new Elephant();
		
		System.out.println("Serialization started---");
		FileOutputStream fos =new FileOutputStream("C:\\Users\\RajPatel\\abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		System.out.println("Serialization completed---");
		
		System.out.println("DeSerialization started---");
		FileInputStream fis=new FileInputStream("C:\\Users\\RajPatel\\abc.txt");
		ObjectInputStream os=new ObjectInputStream(fis);
		Elephant e2=(Elephant)os.readObject();
		
		System.out.println("DeSerialization completed---");
		System.out.println(e2.i+" "+e2.j);
	

	}

}
