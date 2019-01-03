package com.Collection.map;

import java.util.TreeMap;

// Object firstKey()
// Object lastKey()
// SortedMap headMap(Object key)
// SortedMap tailMap(Object key)
// SortedMap subMap(Object key1, Object key2)
// Comparator comparator()

// Red-Black Tree
// Insertion Order is not preserved
// duplicates are not allowed
// null insertion is not allowed
// for default sorting order elements should comparable and homogeneous
// Insertion is not preserved and insertion will perform on the basis of key insertion

public class SortedMapDemo {

	public static void main(String[] args) {
	
//		TreeMap t = new TreeMap(Comparator c); for customized sorting order
//		TreeMap t = new TreeMap(SortedMap m);
//		TreeMap t = new TreeMap(Map m);
		
		TreeMap map = new TreeMap(); // for default natural sorting order
			
		map.put(100, "zzz");
		map.put(103, "yyy");
		map.put(101, "xxx");
		map.put(104, "zzz");
		
		System.out.println(map);
	}
}
