package com.sp.logicalprogram;

public class MySingleton {
	private static MySingleton instance;
	private MySingleton() {
		
	}
	public static MySingleton getSingleton() {
		synchronized(MySingleton.class) {
			if(instance==null) {
				return new MySingleton();
			}
		}return instance;
		}

}
