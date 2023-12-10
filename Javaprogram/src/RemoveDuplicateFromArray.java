

public class RemoveDuplicateFromArray {
	
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 10, 10, 20, 30, 30 , 40,50,50,50};
        int n = a.length;
 
        n = removeduplicates(a, n);
 
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        
       // Reverse thye order aqnd remove duplicate
        int[] reverse=new int[n];
		int f=0;
		for(int k=n-1;k>=0;k--) {
			reverse[f]=a[k];
			f++;
		}
		for(int g:reverse) {
			System.out.print(g+" ");
		}
    }

}
