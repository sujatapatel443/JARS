
public class ArrayQuestionPractice {

	public static void main(String[] args) {
		int[] nums = { 1, 1,3,3, 4, 5, 6, 7, 8 };
		int n=nums.length;
		n=removeDuplicateFromArray(nums,n);
		
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
		}

	}

	static int removeDuplicateFromArray(int[] nums, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				
				temp[j++]=nums[i];
			}
		}
		temp[j++]=nums[n-1];
		for(int k=0;k<j;k++) {
			nums[k]=temp[k];
		}
		return j;
	}

}
