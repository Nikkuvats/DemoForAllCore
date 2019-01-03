package com.Collection.ArrayListAndLinkedList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		LinkedList<String> l2 = new LinkedList<>(); // Empty liked list object

		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");

		System.out.println(l1.get(3));
		
		l1.add(3, "z"); // Array list is the worst choice when set any element or object in middle at
						// any index.

		System.out.println(l1);

		l2.add("Aayush");
		l2.add("Vinay");
		l2.add("Anant");
		l2.add("Nikku");
		l2.add("Aayush");
		l2.add(null);

		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		l2.addFirst("hello");
		l2.addLast("hihi");
		System.out.println(l2);

		l2.set(2, "Devesh"); // linked list is the best choice when set any element in middle at any index.

		l2.add(3, "Shivam"); // linked list is the best choice when add new element or object in middle at
								// any index.

		System.out.println(l2);
	}
}
