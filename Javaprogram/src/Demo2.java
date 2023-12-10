
public class Demo2 {

	public static void main(String[] args) {
		//String str="Hello everyone I am doing my work";
		
		Fcatorial fa=new Fcatorial();
		int factRes=fa.fact(6);
		
		System.out.println(factRes);
		
		System.out.println(0/0.0);
		
		}

	}

class Fcatorial{
	int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
}


	
	


