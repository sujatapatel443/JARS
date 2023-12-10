package com.java8.straemapi;

public class Sorting {

	public static void main(String[] args) {
		
		int[] arr= {10,20,15,25,30,35};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] =arr[j+1];
					arr[+1] =temp;
				}
			}
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		System.out.println(arr[arr.length-2]);

	}

}
