
public class FactorialByRecursion {
	
	//the product of an integer and all the integers below it

	public static void main(String[] args) {
		
		Hello h=new Hello();
		int n=5;
		long fact=h.factorial(5);
		
		System.out.print(fact+" ");

	}

}

class Hello{
	long factorial(int n) {
		if(n == 1 || n==0) {
			return n;
		}else {
			return n*factorial(n-1);
		}
	}
}
