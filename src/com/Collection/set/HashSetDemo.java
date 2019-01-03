package com.Collection.set;

import java.util.HashSet;
import java.util.Set;

// Duplicates are not allowed 
// heterogeneous object are allowed
// Underlying data-structure is hashtable
// Insertion Order is not preserved and it is based on hashcode of objects
// Null insertion is possible but only once
// HashSet is the best choice if our frequent operation is search operation
// add method is boolean
// HashSet default initial capacity = 16, fill ratio 0.75 
// HashSet = Hashtable , Insertion order not preserved , based on hashed code of element
// Introduced in 1.2 version

class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new java.util.HashSet<String>();
		
		set.add("One");
	//	System.out.println(set.add("One")); duplicates are not allowed
		set.add("Two");
		set.add("Five");
		set.add("Six");
		set.add("Seven ");
		set.add("Eight");
		set.add(null);
		set.add(null);
		System.out.println(set);
	//	System.out.println(set.add(null)); duplicates are not allowed
	//	System.out.println(set);
		
		HashSet<Integer> sets = new HashSet<Integer>();
		sets.add(6);
		sets.add(5);
		sets.add(9);
		sets.add(3);
		sets.add(7);
		sets.add(4);
		sets.add(3);
	
	//	System.out.println(sets);
		
		HashSet<String> setss = new HashSet<String>();
		setss.add("A");
		setss.add("A");
		setss.add("B");
		System.out.println(setss);
	}
}
