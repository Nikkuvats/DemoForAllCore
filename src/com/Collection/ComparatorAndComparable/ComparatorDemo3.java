package com.Collection.ComparatorAndComparable;

// If we are depending on default sorting order compulsory object should be homogeneous and comparable 

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo3 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new MyComparators());
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("Z"));
		set.add(new StringBuffer("K"));
		set.add(new StringBuffer("L"));
		set.add("M");
		set.add("C");
		System.out.println(set);
	}
}

class MyComparators implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		String  s1 = o1.toString();
		String  s2 = o2.toString();
		
	return s1.compareTo(s2);
	}
}