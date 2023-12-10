package com.java8.straemapi;

import java.util.*;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StraemApi {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList();
		listOfString.add("String Level -0");
		listOfString.add("Array Level -0");
		listOfString.add("DS SLL");
		listOfString.add("Java5");
		listOfString.add("Design patterns");
		listOfString.add("Java9");
		listOfString.add("Array Level -1");
		listOfString.add("MicroService");
		listOfString.add("Apache Kafka");
		listOfString.add("ab");
		listOfString.add("acs");
		listOfString.add("a");
		

		System.out.println(listOfString);

		List<Integer> listOfdob = new ArrayList();
		listOfdob.add(1990);
		listOfdob.add(1790);
		listOfdob.add(1890);
		listOfdob.add(1950);
		listOfdob.add(2940);
		listOfdob.add(1920);
		listOfdob.add(1921);
		listOfdob.add(1925);

		System.out.println("LKist Of DOB " + listOfdob);

		System.out.println("Start Integer stream ---");
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		intStream.forEach(a -> System.out.println(a));

		System.out.println("End Integer stream ---");

		System.out.println("Start String stream ---");
		Stream<String> stringStream = Stream.of("a", "b", "c", "d", "f", "g", "h", "s");
		stringStream.forEach(b -> System.out.println(b));

		System.out.println("End String stream ---");

		System.out.println("Start Integer Array stream ---");
		Stream<Integer> integerArray = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 });
		integerArray.forEach(c -> System.out.println(c));

		System.out.println("End Integer  Array stream ---");

		System.out.println("**********************");

		List<String> playlistwithfilter = listOfString.stream().filter(a -> a.length() > 2)
				.collect(Collectors.toList());
		System.out.println(playlistwithfilter);

		System.out.println("Start list of dob-----");
		List<Integer> doblistwithfilter = listOfdob.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println("List of Even DOB " + doblistwithfilter);
		System.out.println("End list of dob----");

		System.out.println(" Start ApipothiPlayList video count----");
		Set<ApipothiPlayList> playlistvideocount = playlist().stream().filter(c -> c.getPlaylistvideo() > 10)
				.collect(Collectors.toSet());
		System.out.println("Play list video name which is greter than 10 :" + playlistvideocount);
		System.out.println(" Start ApipothiPlayList video count----");

		System.out.println("Map start-----------");
		List<String> listOfStringaddedwithtutorials = listOfString.stream().map(l -> l + "Tutorials")
				.collect(Collectors.toList());
		System.out.println("Playlist ending with Tutorials " + listOfStringaddedwithtutorials);
		System.out.println("Map End-----------");

		System.out.println("start increase dob one year---");
		List<Integer> Increaseddoblist = listOfdob.stream().map(a -> a + 1).collect(Collectors.toList());
		System.out.println("DOB llist increased with one year :" + Increaseddoblist);
		System.out.println("end increase dob one year---");
		
		//INCREAMENT ALL VIDEO COUNT BY 1
		List<Integer>increasevideocount=playlist().stream().map(a ->a.getPlaylistvideo()+1).collect(Collectors.toList());
		System.out.println("Increase video count by one :"+increasevideocount);
		
		
		System.out.println("----------start sorted -string-------------------");
		Set<String>sortedlistOfString=listOfString.stream().sorted().collect(Collectors.toSet());
		
		System.out.println("default natural sorting list is "+sortedlistOfString);
		
		List<Integer> sortedlist=listOfdob.stream().sorted().collect(Collectors.toList());
		System.out.println("default natural sorting list is "+sortedlist);
		
		List <ApipothiPlayList>sortedplaylist=playlist().stream().sorted((l1,l2)->l2.getPlaylistname().compareTo(l1.getPlaylistname())).collect(Collectors.toList());
		System.out.println("custom sorted list is "+sortedplaylist);
		
		System.out.println("----------end------sorted -string-------------------");

	}

	public static List<ApipothiPlayList> playlist() {
		List<ApipothiPlayList> playList = new ArrayList();
		ApipothiPlayList c = new ApipothiPlayList(1, 17, "String Level0");
		ApipothiPlayList arraylevel0 = new ApipothiPlayList(1, 25, "ArrayLevel0");
		ApipothiPlayList dssll = new ApipothiPlayList(3, 15, "DS SLL");
		ApipothiPlayList java5 = new ApipothiPlayList(4, 6, "java5");
		ApipothiPlayList dp = new ApipothiPlayList(5, 6, "Design Patterns");
		ApipothiPlayList java9 = new ApipothiPlayList(6, 6, "java9");
		ApipothiPlayList java8 = new ApipothiPlayList(7, 5, "java9");
		ApipothiPlayList arraylevel = new ApipothiPlayList(8, 11, "Array Level-1");
		ApipothiPlayList microservice = new ApipothiPlayList(9, 15, "MicroService");
		ApipothiPlayList apachekafka = new ApipothiPlayList(10, 10, "Apache Kafka");

		playList.add(c);
		playList.add(arraylevel0);
		playList.add(dssll);
		playList.add(java5);
		playList.add(dp);
		playList.add(java9);
		playList.add(java8);
		playList.add(arraylevel);
		playList.add(microservice);
		playList.add(apachekafka);
		return playList;

	}

}
