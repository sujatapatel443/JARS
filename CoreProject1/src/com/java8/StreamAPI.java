package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sujata", "ram", "ravi", "", "ram", "shyam", "radha", "", "ram", "sunil",
				"sri", "kisan");
		System.out.println("List: " + list);

		long count = list.stream().count();
		System.out.println("Count of list is :" + count);

		long nonEmptyCount = list.stream().filter(a -> !a.isEmpty()).count();

		System.out.println("Non Empty count of list is:" + nonEmptyCount);
		long emptyCount = list.stream().filter(a -> a.isEmpty()).count();

		System.out.println("Count of empty list is : " + emptyCount);
		long ramCount = list.stream().filter(b -> b.equals("ram")).count();

		System.out.println("count of ram in list is :" + ramCount);

		long shyamcount = list.stream().filter(c -> c.equals("shyam")).count();
		System.out.println("count of shyam in list is : " + shyamcount);

		list.stream().filter(a -> !a.isEmpty()).forEach(b -> System.out.print(b + " "));

		System.out.println();
		List<String> listCollect = list.stream().filter(a -> !a.isEmpty()).distinct().collect(Collectors.toList());

		System.out.println(listCollect);

		List<String> newList = list.stream().filter(a -> !a.isEmpty()).distinct().collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> l = Arrays.asList(10, 12, 5, 9, 3, 4, 6, 7);
		l.stream().map(e -> e * 3).forEach(a -> System.out.print(a + " "));
		// l.stream().map(c ->c*7).forEach(b ->System.out.println(c+" "));
		System.out.println("*********************************");
		listCollect.stream().sorted().forEach(a -> System.out.print(a + " "));
		System.out.println();
		listCollect.stream().sorted((a, b) -> {
			return b.compareTo(a);
		}).forEach(a -> System.out.print(a + " "));
		System.out.println();

		List<String> ll = listCollect.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(ll);
		
		l.stream().map(a-> a*a).forEach(b->System.out.print(b+" "));

	}

}
