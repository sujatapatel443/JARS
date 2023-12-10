package com.sp.logicalprogram;

public  class CustomSingleton {

		public static CustomSingleton instance;
		
		private  CustomSingleton() {
			
		}
		public static CustomSingleton getCustomSingleton() {
			if(instance==null) {
				synchronized(CustomSingleton.class) {
					if(instance==null) {
						instance= new CustomSingleton();
					}
					
				}
			}
			return instance;
		}
		
		
} 
