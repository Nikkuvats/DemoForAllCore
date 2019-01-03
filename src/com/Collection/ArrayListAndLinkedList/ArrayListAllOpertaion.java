package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//  three constructors 
//	ArrayList()  initial capacity 10
//  ArrayList(collection) containing the element of specified collection
//	ArrayList(capacity) create empty arraylist with initial capacity you can provide 


public class ArrayListAllOpertaion {
	
	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	
	for(int i=0; i<6;i++) {
	list.add(i);
	}
	ArrayList<Integer> alist = new ArrayList<Integer>();
	alist.ensureCapacity(5);
	alist.add(1);
	alist.add(3);
	alist.add(4);
	alist.add(2);
	alist.add(5);
	alist.add(6);
	System.out.println(alist);
	System.out.println(alist.size());
	System.out.println(alist.isEmpty());
	System.out.println(alist.contains(4));
	System.out.println(alist.remove(4));
	System.out.println(alist);
	alist.add(4, 5);
	list.addAll(alist);
	System.out.println(alist); 
	System.out.println(alist.size());
	System.out.println(alist.get(3));
	alist.set(2, 1000);
	System.out.println(alist);
	}
}
