
public class SortingOfArrayInDescendingOrder {

	public static void main(String[] args) {
		
		int[] arr = { 13, 2, 7, 3, 5, 4, 21, 8, 9, 10, 15 };
		
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		for(int k : arr) {
			if(k%2==0) {
			System.out.print(k+" ");
			}
		} System.out.println();
	}

}
