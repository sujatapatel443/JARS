public class Test2 {

	public static void main(String[] args) {
		int n=123;
		int temp=n;
		int reverse=0;
		int rem;
		while(temp!=0) {
			rem=temp%10;
			
			reverse=reverse*10+rem;
			temp=temp/10;
			
		}
		if(n==reverse) {
			System.out.println("Number "+n+" is Palindrome number ");
		}else {
			System.out.println("Number "+n+" is  not Palindrome number ");
		}


	}

}
