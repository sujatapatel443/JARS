import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith1 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(201);l.add(111);l.add(405);l.add(123);l.add(1052);l.add(7654);l.add(16782);
		
		List<Integer> fList=l.stream().filter(a->a.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(fList);
		
		List<Integer> fList1=l.stream().filter(a->String.valueOf(a).startsWith("1")).collect(Collectors.toList());
		System.out.println(fList1);
		
		List<Integer> fList2=l.stream().filter(a->a.toString().charAt(0)=='1').collect(Collectors.toList());
		System.out.println(fList2);

	}

}
