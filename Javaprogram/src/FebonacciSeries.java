
public class FebonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int counter=0;
		for(int i=0;i<=10;i++) {
			System.out.print(a+" ");
			counter=a+b;
			a=b;
			b=counter;
		}

	}

}
