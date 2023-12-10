package com.object;

public class StringDemo {

	public static void main(String[] args) {
		Student s1=new Student(12," Sujata "," BSc");
		Student s2=new Student(11 ," Raj","MCA");
		Student s3=new Student(13," Anusha","Science");
		Student s5=new Student();
		Student s4=null;
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s3);
		System.out.println(s5);
		String cname=s5.getClass().getName();
		int s=s1.hashCode();
		System.out.println(cname);
		System.out.println(s);

	}

}
class Student{
	int id;
	String name;
	String course;
	Student(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	Student(){
		
	}
	
	
	  @Override public String toString() { return id+" "+name+" "+course;
	  
	  }
	 
	 
	 
}
