package com.Collection.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

// Comparator meant for customized sorting order 
// Comparator interface present in java.util package and it defines methods compare and equals
// For comparing we need to provide implementation only for one compare method 

public class ComparaterDemo  {

	public static void main(String[] args) {
	
		TreeSet set = new TreeSet(new MyComparetor());
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(5);
		set.add(20);
		set.add(20);
		System.out.println(set);
	}
}

class MyComparetor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		if(I1 < I2) {
			return +1;
		}
		else if(I1 > I2) {
			return -1;
		}	
		else if(I1 == I2) {
			return 0;
		}
	return 0;
	}
}
