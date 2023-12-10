
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 1, 2, 4, 4, 5, 6, 7, 7, 8, 10, 25 };

		int n = arr.length;

		for (int l = 0; l < arr.length - 1; l++) {
			
			for(int i=0;i <arr.length-1;i++) {
			
			if (arr[i] > arr[i + 1]) {

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			}
		}
		System.out.println(arr);

		
		n = removeDuplicate(arr, n);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * int n=arr.length;
	 * 
	 * n=removeDuplicate(arr,n);
	 * 
	 * for(int i =0; i< n; i++) { System.out.print(arr[i]+" ");
	 */

	/*
	 * for(int a:arr) { System.out.print(a+" "); }
	 */

	/*
	 * static int removeDuplicate(int[] arr, int n ) {
	 * 
	 * if(n == 0 || n == 1) { return n; }
	 * 
	 * int[] temp = new int[n];
	 * 
	 * int j=0;
	 * 
	 * for(int i = 0; i<arr.length-1;i++ ) {
	 * 
	 * if(arr[i] != arr[i+1]) { temp[j++] =arr[i];
	 * 
	 * } } temp[j++] = arr[n-1];
	 * 
	 * for(int k=0; k < j; k++) { arr[k] =temp[k]; } return j;
	 */

	static int removeDuplicate(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {

				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int k = 0; k < j; k++) {

			arr[k] = temp[k];
		}
		return j;
	}
}
