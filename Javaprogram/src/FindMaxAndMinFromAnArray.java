
public class FindMaxAndMinFromAnArray {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 7, 8, 9, 20, 35, 8, 14 };

		findMinAndMax(nums);

		for (int a : nums) {
			System.out.print(a + " ");
		}

	}

	static void findMinAndMax(int[] nums) {

		int max = nums[0];

		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > max) {
				max = nums[i];
			} else {
				if (nums[i] < min) {
					min = nums[i];
				}

			}

		}

		System.out.println("Min element of Array is: " + min);

		System.out.println("Max element of Array is: " + max);

	}

}
