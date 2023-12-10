import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArraySorting {

	public static void main(String[] args) {
		//sorting second highest number from given array
			Integer[] arr={5,1,10,11,4,3,6,7,2,8,9,12};
		
		List<Integer> list = Arrays.asList(arr);
		
		Optional<Integer> sortedList=list.stream().sorted((a,b)->b-a).skip(2).findFirst();
		
		System.out.println(sortedList.get());
		
		
		//find even number from the given array
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
				
			}
			
			}
		System.out.println();
		//find the left highest number
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.err.println();
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print(arr[arr.length-2]+" ");
		
			
		}
		
		

	}


