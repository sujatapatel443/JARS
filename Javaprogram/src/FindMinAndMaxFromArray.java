
public class FindMinAndMaxFromArray {
	
	public static void main(String[] args) {
		
		
		int[] nums = {2,4,5,2,3,5,6,7,8,1,1,3,9,10,25};
		int n=nums.length;
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
		n=removeDuplcate(nums,n);
		
		for(int k=0;k<n;k++) {
			System.out.print(nums[k]+" ");
		}
	}
	
	static int removeDuplcate(int[] nums,int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int[] temp=new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(nums[i]!=nums[i+1]) {
				temp[j++]=nums[i];
			}
		}
		
		temp[j++]=nums[n-1];
		
		for(int i=0;i<j;i++) {
			nums[i]=temp[i];
		}return j;
	}
	 
	}
	

