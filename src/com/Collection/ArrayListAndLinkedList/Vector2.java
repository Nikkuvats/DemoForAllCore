package com.Collection.ArrayListAndLinkedList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Enumeration cursor applicable only for legacy classes
// By using Enumeration we can get only read access and we can perform remove operation

public class Vector2 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 11; i++) {

			v.addElement(i);
		}
		System.out.println(v.get(3));
		Iterator<Integer> enumeration = v.iterator();
		while (enumeration.hasNext()) {
			Integer I = (Integer) enumeration.next();
			if (I % 2 == 0) {
				enumeration.remove();
			}
		}
		System.out.println("Empty : "+v);
	}
}
