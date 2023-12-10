
public class Demo {

	public static void main(String[] args) { 
		
		int[] arr= {13,2,7,3,5,4,21,8,9,10,15};
		int tmp[]=new int[arr.length];
		
		int j=0;
		
		for(int i=arr.length-1; i>=0; i--) {
			
			tmp[j]=arr[i];
			j++;
		}
		
		for(int a:tmp) {
			System.out.print(a+" ");
		}
		System.out.println();
		// 21 
		boolean flag=false;
		int k=0;
		for(k=0; k<arr.length; k++ ) {
			if(arr[k]==21) {
				flag=true;
				
				System.out.println("Index of "+21+" is :"+k);
				break;
			}
		}
		
		System.out.println(k);
		
	}

}

