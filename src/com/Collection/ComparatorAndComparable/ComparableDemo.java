package com.Collection.ComparatorAndComparable;

// Default nature sorting order meant Comparable Interface and compareTo method which return int value.
// Comparable present in java.lang package and provide one method compareTo 

public class ComparableDemo {
	
	public static void main(String[] args) {
	
		System.out.println("A".compareTo("Z"));//	-ve
		System.out.println("Z".compareTo("K"));//	+ve
		System.out.println("A".compareTo("A"));//	0
	//	System.out.println("A".compareTo(null));// RE :  Null pointer exception
	}
}
