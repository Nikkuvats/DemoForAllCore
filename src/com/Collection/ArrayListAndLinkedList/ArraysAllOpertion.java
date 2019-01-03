package com.Collection.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAllOpertion {
	
	public static void main(String[] args) {
		String b[] = {"aayush","chetan","vinay","shivam","anant"};
		
		int reterive = Arrays.binarySearch(b, "vinay");
		System.out.println(reterive);
		
		Arrays.sort(b);
		for (String string : b) {
			System.out.println(string);
		}
		ArrayList aList = new ArrayList();
		for (int i = 0; i < b.length; i++) {
			aList.add(b[i]);
		}
		Collections.reverse(aList);
		Object[] b2 = aList.toArray();
		for (int i = 0; i < b2.length; i++) {
			System.out.println(b2[i]);
		}
	}
}
