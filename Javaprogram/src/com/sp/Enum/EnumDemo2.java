package com.sp.Enum;

public class EnumDemo2 {
	public static void main(String[] args) {
		Week week=null;
		week=Week.Friday;
		System.out.println(week);
		System.out.println(week.Tuesday);
		System.out.println(week.Tuesday);
		System.out.println(week.Wednesday);
		System.out.println(week.Friday);
		System.out.println(week.Saturday);
		System.out.println(week.Sunday);
		
	}

}
enum Week{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
	Week( ){
		System.out.println("--Week default constructor--");
	}
}
