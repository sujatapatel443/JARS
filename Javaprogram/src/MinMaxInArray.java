
public class MinMaxInArray {

	public static void main(String[] args) {

		int a[] = { 10, 5, 23, 2, 35, 5, 7, 123, 231, 9, 999, 765 };

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			} else if (a[i] < min) {

				min = a[i];
			}

		}

		System.out.println("Min element of given array is:" + min);
		System.out.println("Max element of given array is:" + max);

	}

}
