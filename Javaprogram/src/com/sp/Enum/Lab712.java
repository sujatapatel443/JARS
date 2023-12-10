package com.sp.Enum;

public class Lab712 {

	public static void main(String[] args) {
		Direction2 arr[]=Direction2.values();
		for(Direction2 d:arr) {
			System.out.println(d.ordinal()+"\t"+d.name());
		}
		try {
			Direction2 d=Direction2.valueOf("west");
			System.out.println("Direction found with the name");
			
		}catch(IllegalArgumentException ex) {
			System.out.println("**No Direction found with the name");
		}
		Direction2 d=Direction2.valueOf("WEST");
		System.out.println(d);

	}

}
enum Direction2{
	EAST(0),NORTH(90),WEST(180),SOUTH(270);
	int angle;
	Direction2(int angle){
		this.angle=angle;
		System.out.println("Direction Def() cons***");
	}
	static {
		System.out.println("**Static block in default constructor");
	}
}
