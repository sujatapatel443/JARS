package com.sp.iopackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader1 {
	public String readLine() throws IOException {
		StringBuffer sb = new StringBuffer();
		while (true) {
			int asc = System.in.read();
			if (asc == 13)
				;
			else if (asc == 10)
				break;
			else {
				char ch = (char) asc;
				sb.append(ch);
			}

		}
		return sb.toString();

	}

}

class Reader2 {

	public static void main(String[] args) throws IOException {
		File f=new File("abc");
		System.out.println(f.exists());
		boolean f1=f.createNewFile();
		f.exists();
		
		Reader1 r = new Reader1();
		System.out.println("Enter sid");
		String sid = r.readLine();
		System.out.println("Enter name");
		String name = r.readLine();
		System.out.println("Enetr phone");
		String ph = r.readLine();
		System.out.println("Enter fee");
		String fee = r.readLine();

	}
}
