import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayMultipl {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5};
		int res=1;
		for(int i=0;i<a.length;i++) {
			res=res*a[i];
		}
		System.out.println("Multiplication of array :"+res);
		
		List<Integer> l=Arrays.asList(a);
		Optional<Integer> m=l.stream().reduce((c,d)->c*d);
		System.out.println(m.get());
		
		/*
		 Employee -> {id, name, sal}
	e1 -> {1, "Ajay", 190000}
	e2 -> {2, "Sai", 20000}
	e3 -> {1, "Ajay", 180000}
	AL - {e1,e2,e3}
		 
		 */

	}

}
