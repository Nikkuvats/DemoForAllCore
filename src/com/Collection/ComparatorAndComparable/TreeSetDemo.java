package com.Collection.ComparatorAndComparable;

import java.util.TreeSet;

class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		/*set.add("Aayush");
		set.add("Shivam");
		set.add("Nikku");
		set.add("Chetan");
		set.add("Nikhil");
		set.add("Anant");
		set.add("Aayush");*/// duplicates are not allowed
		
		set.add(null);// in 7 version even 1st null element not allowed
		
		System.out.println(set);
	}
}