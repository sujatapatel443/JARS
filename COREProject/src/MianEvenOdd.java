import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MianEvenOdd {

	public static void main(String[] args) {
		String s="Hi, I am Raj and I am a programmer Raj";
		
		String st[]=s.split(" ");
		List<String> l=Arrays.asList(st);
		
		Map<String,Long> mm=l.stream().filter(d->Collections.frequency(l, d)>1).collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		System.out.println(mm);
		B ref=null;
		ref.m1();
		
	}

}

class B{
	
	static void m1() {
		System.out.println("m1()-----B");
	}
}

