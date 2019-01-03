package com.Collection.ComparatorAndComparable;

// Runtime Exception cause of StringBuffer does'nt implements comparable 
// For default sorting object should be comparable and homogeneous otherwise we will get ClassCastException

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet object = new TreeSet();
		object.add(new StringBuffer("A"));
		object.add(new StringBuffer("Z"));
		object.add(new StringBuffer("L"));
		object.add(new StringBuffer("B"));
		System.out.println(object);
	}
}
