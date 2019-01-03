package com.Collection.ArrayListAndLinkedList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Vector<Integer> s = new Vector<Integer>();
		for(int i = 0; i < 10; i++) {
			s.add(i);
		}
		
		for(int x = s.size()-1; x >= 0; x--) 
		{
			if(x % 2 == 0) {
				s.remove(x);
			}
		}
		
		System.out.println(s);
		
		Enumeration<Integer> enumeration = s.elements();
		while(enumeration.hasMoreElements()) {
			Integer integer = (Integer) enumeration.nextElement();
			if(integer % 2 == 0) {
				s.remove(integer);
			}
		}
		System.out.println(s);
		//System.out.println(s);
	}
}
