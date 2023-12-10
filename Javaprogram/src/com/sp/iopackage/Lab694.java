package com.sp.iopackage;

import java.io.File;

public class Lab694 {

	public static void main(String[] args) {
		File file=new File("C:\\");
		
		File files[]=file.listFiles();
		
		for(File f:files) {
			System.out.println(f+"->isFile:"+f.isFile()+",isDir:"+f.isDirectory());
		}
		
		

	}

}
