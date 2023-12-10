package com.sp.iopackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serilization {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\RajPatel\\Hello.java");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Student st=new Student(101,"Sujata",9125681423l);
			System.out.println(st);
			st.sid=102;
			st.name="Raj";
			st.phone=9452635878l;
			System.out.println(st);
			Student.count=9;
			
			oos.writeObject(st);
			System.out.println("Object is serilized");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
class Student implements Serializable{
	
	int sid;
	
	String name;
	
	long phone;
	
	static int count=3;
	
	Student(int sid,String name,long phone){
		this.sid=sid;
		
		this.name=name;
		
		this.phone=phone;
	}
	public String toString() {
		return "sid is : "+sid+"\t"+"Name is : "+name+"\t"+"Phone is : "+phone+"\t"+" Count is :" +count;
	}
	
	
}
