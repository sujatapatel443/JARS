package com.sp.Enum;

public class EnumDemo3 {

	public static void main(String[] args) {
		Year year=null;
		year=Year.April;
		System.out.println(year);
		System.out.println(year);

	}

}
enum Year{
	January(1),February(2),March(3),April(4),May(5),June(6),July(7), August(8),Sep(9),October(10),November(11),Decmber(12);
	
	Year(int i){
		System.out.println("Default constructor");
		
	}
}
