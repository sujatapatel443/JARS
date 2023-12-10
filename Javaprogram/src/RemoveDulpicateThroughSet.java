import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDulpicateThroughSet {

	public static void main(String[] args) {
		
		int[] arr= {4,2,1,3,3,2,4,6,7,7,8,9,9,10};
		
		  Set <Integer> t=new TreeSet<>((a,b)->b-a);
		  Set<Integer> set=new  HashSet<Integer>();
		 
		  for(int a:arr) {
			  set.add(a);
			  t.add(a); }
		  System.out.print(set+" ");
		  System.out.println();
		  System.out.println(t);
		  System.out.println("****************");
		  Set<Integer>set1=new TreeSet<>((a,b)->b-a);
		  
		  for(int c:arr) {
			 System.out.print(c+" ");
			 
		  }
		 
	}

}
