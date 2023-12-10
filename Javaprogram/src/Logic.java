
public class Logic {

	public static void main(String[] args) {
		
		int num=371;
		int temp=num;
		int res=0;
		int rem=0;
		
		while(temp>0) {
			rem=temp%10;
			
			temp=temp/10;
			
			res=res+rem*rem*rem;
		}
		if(num==res) {
			System.out.println(num+" is Armstrong number");
		}else {
			System.out.println(num+" is not Armstrong number");
		}
}
}