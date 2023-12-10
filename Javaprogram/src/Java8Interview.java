import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Interview {
	
	public static void main(String[] args) {
		Integer array []= {5,1,10,11,4,3,6,7,2,8,9,12};
		
		List<Integer> col=Arrays.asList(array);
		
		Optional<Integer> opt=col.stream().sorted((a,b)->b-a).skip(1).findFirst();
		System.out.println(opt.get());
		
		
		List<Integer> newList=col.stream().sorted().collect(Collectors.toList());
		System.out.println(newList);
	}

}
