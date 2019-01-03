package com.Collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomized {
	
	public static void main(String[] args) {
	
		TreeMap<Integer,String> t = new TreeMap<Integer,String>(new MyComparators());
		t.put(10,"XXX");
		t.put(30,"YYY");
		t.put(20,"AAA");
		t.put(40,"QQQ");
		
		System.out.println(t);
	}
}

class MyComparators implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		Integer s1 = (Integer) o1;
		Integer s2 = (Integer) o2;
		
	return s2.compareTo(s1);
	}
	
	
}
