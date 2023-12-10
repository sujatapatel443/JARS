
public class Merge_Two_Array {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,4,3,5};
		
		int[] arr2= {6,7,9,8};
		
		int finalLength= arr1.length+arr2.length;
		
		int[] arr3=new int[finalLength];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		int m=arr1.length;
		
		for(int i=0;i<arr2.length;i++) {
			arr3[m]=arr2[i];
			m++;
		}
		
		for(int i:arr3) {
			System.out.print(i+" ");
		}
	}

}
