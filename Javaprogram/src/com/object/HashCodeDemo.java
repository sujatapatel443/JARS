package com.object;

public class HashCodeDemo {

	public static void main(String[] args) {
		System.out.println("\n ****with Employee*****");
		Employee e1=new Employee(11,"sujata",9125681423l);
		Employee e2=new Employee(13,"ravi",9453645878l);
		Employee e3=new Employee(12,"anusha",94657389382l);
		Employee e4=new Employee(14,"Anu",826436575788l);
		Employee e5=e1;
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
		System.out.println(e5==e1);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e5));
	}

}
class Employee{
	int id;
	String name;
	long phone;
	Employee(int id,String name,long phone){
		this.id=id;
		this.name=name;
		this.phone=phone;
		
	}
	@Override
	public int hashCode() {
		return (int)(phone |id);
	}
}
