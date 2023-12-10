package com.sp.utilpackage;

import java.util.Arrays;

public class ArraysUtilityMethodDemo1 {

	public static void main(String[] args) {
		int arr[]=new int[] {10,32,40,15,20,39};
		System.out.println("------Normal order----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"\t"+arr[i]);
		}
		System.out.println("----sorted order-----");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"\t"+arr[i]);
			
		}
		System.out.println("-----Binary search------");
		int index=Arrays.binarySearch(arr, 32);
		System.out.println(index);
		System.out.println("-----equals int[], int[]-----");
		int values[]=new int[] {43,23,53,33,63,90};
		System.out.println(Arrays.equals(arr, values));
		int data[]=new int[] {43,23,53,33,63,90};
		System.out.println(Arrays.equals(values, data));
		
				
		
		
		

	}

}
