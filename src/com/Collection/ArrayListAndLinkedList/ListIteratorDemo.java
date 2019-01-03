package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// By using List Iterator we can move either to the forward direction or to the backward direction
// methods 
// public boolean hasNext()
// public Object next()
// public int nextIndex()
// List previous method  

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			
			list.add(i);
		}
		
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()) {
			Integer object = (Integer) iterator.next();
			if(object % 2 == 0 ) {
			
			}
			else 
			{
				iterator.remove();
			}
		}
		System.out.println(list);
	}
}
