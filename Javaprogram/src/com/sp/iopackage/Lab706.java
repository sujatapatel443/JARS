package com.sp.iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab706 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\RajPatel\\ai.java");
		f.exists();
		f.createNewFile();
		f.exists();
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\RajPatel\\Hai.java");

				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Student st = new Student(11, "Anusha", 436677l);
			Student.count = 9;
			System.out.println(st);
			System.out.println("Object is serilized");

		}

	}

}

//class Person implements Serilizable{
class Person {
	transient String name = "Sujata";
	long phone = 9452635878l;
}

class Student extends Person implements Serializable {
	int sid;
	static int count;

	Student(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return "sid is : " + sid + "\t" + "Name is : " + name + "\t" + "Phone is : " + phone + "\t" + "Count is : "
				+ count;
	}
}
