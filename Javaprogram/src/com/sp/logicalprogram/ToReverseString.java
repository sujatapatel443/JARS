package com.sp.logicalprogram;

public  class ToReverseString {
	public static void main(String[] args) {
		String str="SujataPatel";
		int length=str.length();
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse of "+str+" is ->"+reverse);
		
		String s="hai anusha hai rani hai soni hai guni hai rita ";
		String word="hai";
		String st[]=s.split(" ");
		int count=0;
		for(int i=0;i<st.length-1;i++) {
			if(word.equals(st[i])) {
				count++;
			}
			
		}
		System.out.println("Occurence of hai is ->"+count);
		
		String s2="sushmitasinghssssshah";
	    char ch='s';
	    int count2=0;
	    for(int i=0;i<s2.length();i++) {
	    	if(s2.charAt(i)==ch) {
	    		count2++;
	    	}
	    }
	    System.out.println("Count of s in "+s2+" is ->"+count2);
	    
	    Hello hello=new Hello();
	    int n=5;
	    long fac=hello.factorial(5);
	    System.out.println("Factorial of "+n+ " is ->"+fac);
	    //Febonacci series
	    int a=0;
	    int b=1;
	    int c=0;
	    for(int i=1;i<=10;i++) {
	    	c=a+b;
	    	System.out.print(c+" ");
	    	a=b;
	    	b=c;
	    }
	    //palindrome number
	    System.out.println();
	    int num=242;
	    int temp=num;
	    int rev = 0;
	    int rem;
	    while(temp!=0) {
	    	rem=temp%10;
	    	rev=rev*10+rem;
	    	temp=temp/10;
	    }
	    if(num==rev) {
	    	System.out.println(num+" is  a palindrome Number");
	    	
	    }else {
	    	System.out.println(num+" is not a palindrome Number");
	    	
	    }
	    
	    Intf intf=()->System.out.println("show () of Intf");
	    intf.show();
	    
	}

}
class Hello{
	long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}
}
@FunctionalInterface
interface Intf {
	void show();
	
}
