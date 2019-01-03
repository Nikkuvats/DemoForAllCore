package com.Collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedAllDemo {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> set = new TreeSet<Integer>(new MyComparator());
		set.add(5);
		set.add(6);
		set.add(4);
		set.add(3);
		set.add(7);
		set.add(2);
		System.out.println(set);
		System.out.println(set.last());
		System.out.println(set.subSet(1, 5));
		System.out.println(set.tailSet(4));
		}
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 =(Integer)o1;
		Integer i2 =(Integer)o2;
	return i2.compareTo(i1);
	}
}
