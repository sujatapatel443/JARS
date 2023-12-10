package com.sp.logicalprogram;

public class FindFirstAndLastIndexOfNumber {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2,3,2,2,5,2,6};
		
		int a=0;
		int b=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]==2) {
					count++;
					if(count==1) {
						a=i;
					}
					b=i;
				}
				
			
		}
		System.out.println(a+"\t"+b);
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if((arr[i]+arr[j])%2!=0 && i<j) {
					System.out.println(i+"\t"+j);
				}
				
			}
		}
	}
}