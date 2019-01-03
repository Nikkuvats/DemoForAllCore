package com.Collection.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,10, new MyComparator()));
		System.out.println(Collections.binarySearch(l, 13, new MyComparator()));
	}
}
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
	return I2.compareTo(I1);
	}
}
