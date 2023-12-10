package com.sp.wrapperclass;

public class WrapperClass2 {

	public static void main(String[] args) {
		jlcService service=new jlcService();
		byte b1=23;
		byte b2=10;
		service.show(b1,b2);
		//Byte b3=0;
		//Byte b4=0;
		//service.show(b3,b4);
		//service.show();
		

	}

}
class jlcService{
	void show(int ab,int bc) {
		System.out.println("\n --show int,int");
	}
   void show(byte ab,byte bc) {
		
	System.out.println("\n --show byte,byte");
   }
	void show( Byte ab, Byte bc) {
		System.out.println("\n show Byte,Byte");
	}
	void show(byte...ab) {
		System.out.println("\n--show byte ");
	}

	
}
