package com.Collection.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorString {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new MyComparetorString());
		set.add("Roja");
		set.add("ShobhaRani");
		set.add("RajKumari");
		set.add("GangaBhavani");
		set.add("Ramulamma");
		System.out.println(set);
	}
}

class MyComparetorString implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String S1 = (String) o1;
		String S2 = (String) o2;

	//	return S1.compareTo(S2);
		return -S1.compareTo(S2);
	}
}
