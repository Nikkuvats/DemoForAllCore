package com.Collection.set;

// comparateor object provide underlying shorting 
// default sorting order is assending order for integer
// default sorting order is alphabetical order for String
// Except treeSet and TreeMap hetrogeneous object are allowed

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		TreeSet sortedSet = new TreeSet();
		sortedSet.add(107);
		sortedSet.add(105);
		sortedSet.add(109);
		sortedSet.add(110);
		sortedSet.add(101);

		System.out.println(sortedSet);
	
	//  System.out.println(sortedSet.first());// first lowest
	//	System.out.println(sortedSet.last()); // last highest
	//	System.out.println(sortedSet.headSet(105)); // small then
	//	System.out.println(sortedSet.tailSet(101)); // greater then and equal to 101 
		
		
		/*SortedSet set = new TreeSet();
		set.add("Aayush");
		set.add("Shivamnant");
		set.add("Nikku");
		set.add('a');
		set.add("Nikhil");
		set.add("Anant");*/
		
	//	System.out.println(set);
	}
}
