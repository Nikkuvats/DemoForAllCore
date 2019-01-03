package com.Collection.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo2 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet(new ComparatorCondition());
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(5);
		set.add(20);
		set.add(20);
		System.out.println(set);
	}
}

class ComparatorCondition implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		
	//	return I1.compareTo(I2); // Asending
	//	return -I1.compareTo(I2);// Desending
	//	return I2.compareTo(I1); // Desending
	//	return -I2.compareTo(I1);// Asending
	//	return +1;               // Insertion
	//	return -1;               // Reverse
		return 0;                // only first element will be inserted and all remaining are duplicates
	}
}
