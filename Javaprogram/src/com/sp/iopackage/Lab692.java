package com.sp.iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Lab692 {

	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(System.in);

				BufferedReader br = new BufferedReader(isr);
				FileWriter fw = new FileWriter("C:\\Sujata\\abc\\new.txt", true);

				BufferedWriter bw = new BufferedWriter(fw);) {

			char ch = 'y';
			do {
				System.out.println("Enter id");

				String id = br.readLine();

				System.out.println("Enter name");

				String name = br.readLine();

				String info = id + " " + name;

				bw.write(info);

				bw.newLine();

				System.out.println("do you want add more :[Y/N]");
				
				ch = (char) br.readLine().charAt(0);
				
			} while (ch == 'Y');
			
			bw.close();

		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

}
