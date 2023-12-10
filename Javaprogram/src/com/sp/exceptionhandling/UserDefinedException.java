package com.sp.exceptionhandling;

public class UserDefinedException {

	public static void main(String[] args) {
		ClassNotFoundException e=new ClassNotFoundException("132Raj");
		System.out.println(e.sid);
		

	}

}
 class ClassNotFoundException extends RuntimeException{
	 String sid;
	 ClassNotFoundException(){
		 this.sid=sid;
	 }

		public ClassNotFoundException(String string) {
	}

	/*
		 * public String getMessage() {
		 * 
		 * return sid;
		 * 
		 * }
		 */
	 public String toString() {
		 return sid;
	 }
	 
	 
	 
 }
