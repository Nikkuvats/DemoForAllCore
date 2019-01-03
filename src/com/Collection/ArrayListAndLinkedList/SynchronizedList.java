package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedList {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		java.util.List list = Collections.synchronizedList(l); // synchronized List method use to make your list
																// synchronized

		list.add('A');
		list.add('B');
		list.add('c');
		list.add('D');

		System.out.println(list);

		Set s = new HashSet();
		Set set = Collections.synchronizedSet(s);
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(1);
		System.out.println(set);
	}
}
