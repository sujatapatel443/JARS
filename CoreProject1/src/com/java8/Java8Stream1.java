package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Stream1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","abc");
	      System.out.println("List: " +list);
	      
	      long count=list.stream().count();
	      System.out.println("Count of element in List:"+count);
	      long nonEmptyCount=list.stream().filter(a -> !a.isEmpty()).count();
	      System.out.println("Count of Non empty element in List:"+nonEmptyCount);
	      
	      long countAbc=list.stream().filter(s -> s.equals("abc")).count();
	      System.out.println("Count of Non abc element in List:"+countAbc);
	      
	      list.stream().filter(a -> !a.isEmpty()).forEach( b-> System.out.print(b+" "));
	      System.out.println();
	      
	      List<String> listCollect=list.stream().filter(a-> !a.isEmpty() /*&& !a.equals("abc")*/).distinct().collect(Collectors.toList());
	      System.out.println(listCollect);
	      
	      List<Integer> l=Arrays.asList(10,5,78,23,6,9);
	      
	      l.stream().map(i-> i*3).forEach(a-> System.out.println(a));
	      
	      List newList=l.stream().map(i-> i*2).collect(Collectors.toList());
	      System.out.println(newList);
	      
	      listCollect.stream().sorted().forEach(a->System.out.println(a));
	      System.out.println("&&&&&&&&&");
	      listCollect.stream().sorted(new MyComp()).forEach(a->System.out.println(a));
	      System.out.println("&&&&&&&&&");
	      
	      List<String> ll=Arrays.asList("RAJ","ABC","SEEMA","ANUSHA","SUJATA","KUMAR");
	      ll.stream().sorted((o1, o2)-> {
	    	  
	    	  return o2.compareTo(o1);
	    	  
	      }).forEach(a->System.out.println(a));
	      System.out.println("&&&&&&&&&");
	      
		List<String> sortedList=ll.stream().sorted((o1 , o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("&&&&&&&&&");
		System.out.println(sortedList);
	      
	}

}
class MyComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
	
}
