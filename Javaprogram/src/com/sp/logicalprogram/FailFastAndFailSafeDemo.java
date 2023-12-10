package com.sp.logicalprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeDemo {

	public static void main(String[] args) {
		//program  for fail fast iterator
		/*
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(30);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			list.add(23);
			Integer a=(Integer)it.next();
			System.out.print(a+" ");
			*/
		
		//program for fail safe iterator
		List<Integer> list=new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(30);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			list.add(23);
			Integer a=(Integer)it.next();
			System.out.print(a+" ");
			
			
			
			
		}

	}

}
