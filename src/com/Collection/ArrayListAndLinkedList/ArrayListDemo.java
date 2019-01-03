package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList is non synchronized

		ArrayList alist = new ArrayList(3);
		alist.ensureCapacity(3);
		
		alist.add(1);
		System.out.println(alist.size());
		alist.add(2);
		
		Set set = new HashSet(alist);
		
		Iterator iterator = alist.iterator();
		/*while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		alist.add(1);
		alist.add('A');
	//	alist.add(new int[10]);
	//	System.out.println(alist);
		
		LinkedList alist2 = new LinkedList();
		

		System.out.println(alist.size());
		
		
		alist.add(2,"Ravi");
		alist2.addAll(alist);
		alist.add(1);
		alist.add('A');
		alist.add("Vijay");
		alist.add(null);
		alist.add(null);
		alist.add(null);
		alist.add(null);

		alist2.addAll(alist);

	//	System.out.println(alist);
	//	System.out.println(alist2);

		alist.set(1, "Aayush");
	
		
	//	System.out.println(alist);
		alist.remove(2);
	//	System.out.println(alist);
	}
}
