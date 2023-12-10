package com.sp.Enum;

public class EnumDemo1 {

	public static void main(String[] args) {
		Direction d1=null;
		System.out.println(d1);
		//d1=new Direction(0);
		d1=Direction.EAST;
		System.out.println(d1);
		System.out.println(Direction.NORTH);
		System.out.println(Direction.WEST);
		System.out.println(Direction.SOUTH);

	}

}
enum Direction1{
	EAST,NORTH,WEST,SOUTH;
	Direction1(){
		System.out.println("Direction() Default constructor**");
	}
	static {
		System.out.println("**static block in Direction class");
	}
}
