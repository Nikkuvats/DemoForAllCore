package com.Collection.Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysAllMethod{
	
	public static void main(String[] args) {
	
		Integer arr[] = new Integer[]{1,2,3,4,5,6,7};
		int search = 5;
		int reterive = Arrays.binarySearch(arr, search);
		
		List list = Arrays.asList(arr);
		System.out.println(list);
	}
}
