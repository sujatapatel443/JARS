
public class ReverseOfArray {

	public static void main(String[] args) {
		
		//to reverse the given array

		int[] arr = { 2, 3, 5, 4, 7, 6, 8, 9, 10, 10, 26, 34, 56 };

		int[] temp=new int[arr.length-1];
		
		int j=0;
		
		for(int i=arr.length-1;i>0;i--) {
			temp[j]=arr[i];
			
			j++;
		}
		
		for(int a :temp) {
			System.out.print(a+" ");
		}

	}

}
