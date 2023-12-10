package com.object;

public class EqualsMethod {

	public static void main(String[] args) {
		Stud st1=new Stud(12,"Ram");
		Stud st2=new Stud(13,"Amit");
		Stud st3=new Stud(12,"Ram");
		Stud st4=new Stud(14,"Poonam");
		Stud st5=st1;
		
		System.out.println("Comparision using == oprator------");
		System.out.println(st1==st2);
		System.out.println(st2==st3);
		System.out.println(st3==st1);
		System.out.println(st3==st4);
		System.out.println(st5==st1);
		
		System.out.println("Comparision using equals() method------");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st3.equals(st4));
		System.out.println(st4.equals(st2));
		System.out.println(st3.equals(st1));
		System.out.println(st5.equals(st1));
		

	}

}
class Stud{
	int id;
	String name;
	Stud(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Stud) {
			Stud st=(Stud)obj;
			return this.name.equals(st.name)  && this.id==st.id;
		}
		return false;
	}
	
}
