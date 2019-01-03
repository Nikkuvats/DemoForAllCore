package com.Collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetAllOperation {

	public static void main(String[] args) {

		HashSet<Integer> haSet = new HashSet<>();
		for(int i = 0; i<=10; i++) {
			haSet.add(i);
		}
		
		Iterator<Integer> iterator = haSet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			if(integer % 2 == 0) {
				iterator.remove();
			}
		}
		System.out.println(haSet);
	}
}
