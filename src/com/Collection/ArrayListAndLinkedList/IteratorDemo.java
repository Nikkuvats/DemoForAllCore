package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator method of collection interface can be use for all the collection object 
// public boolean hasNext()
// public Object next()
// public void remove()
// can not perform replacement and addition of new object 

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Integer object = (Integer) itr.next();
			if (object % 2 == 0) {
				System.out.println(object);
			} else {
				itr.remove();
			}
		}
	}
}
