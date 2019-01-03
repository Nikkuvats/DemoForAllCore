package com.Collection.set;

import java.util.Set;

// LinkedHashSet = LinkedList + Hashtable
// Insertion order preserved and duplicate are not allowed
// Introduced in 1.4 version

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		java.util.LinkedHashSet<String> set = new java.util.LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Five");
		set.add("Six");
		set.add("Seven ");
		set.add("Eight");
		set.add(null);
	
		System.out.println(set);
		
		Set<Integer> sets = new java.util.LinkedHashSet<Integer>();
		sets.add(6);
		sets.add(5);
		sets.add(9);
		sets.add(3);
		sets.add(7);
		sets.add(4);
		sets.add(3);
	//	sets.add(null);
	//	System.out.println(sets.add(null)); duplicates are n ot allowed
		System.out.println(sets);
	}
}
