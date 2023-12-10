package com.sp.java.builtin;

public class Clone2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hi hi=new Hi(15);
		Helloo h1=new Helloo(11,hi);
		Helloo h2=(Helloo) h1.clone();
		System.out.println(h1==h2);
		System.out.println(h1.hi==h2.hi);
		System.out.println("***********");
		System.out.println(h1.y+"  "+h1.hi);
		System.out.println(h2.y+"  "+h2.hi);
		h1.show();
		h2.show();
		h2.y=23;
		h2.hi.x=30;
		System.out.println(h1==h2);
		System.out.println(h1.hi==h2.hi);
		System.out.println(h1.y+"   "+h1.hi);
		System.out.println(h2.y+"   "+h2.hi);

	}

}
 class Hi{
	 int x;
	  Hi(int x){
		 this.x=x;
		 
	 }
 }
 class Helloo implements Cloneable{
	 int y;
	 Hi hi;
	 Helloo(int y, Hi hi){
		 this.y=y;
		 this.hi=hi;
	 }
	
	void show() {
		 System.out.println("Helloo y->"+y);
		 System.out.println("Helloo hi->"+hi);
	 }
 
 
		 
	  public Object clone()throws CloneNotSupportedException{
		  
			 if(this instanceof Cloneable) {
			 Hi hi=new Hi(this.hi.x);
			 Helloo h=new Helloo(this.y,hi);
			return h;
			
	 }else {
		 throw new
         CloneNotSupportedException();
		 
	 }

				

	  }
	} 
 