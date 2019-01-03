package com.Collection.map;

// the all difference between hashtable and hashmap are the same as arraylist and vector 

import java.util.Hashtable;

public class HastTable {

	public static void main(String[] args) {
		
		Hashtable hashtable = new Hashtable();
		
		hashtable.put(1, "Aayush");
		hashtable.put(3, "Nikku");
		hashtable.put(4, "Anant");
		hashtable.put(2, "Vinay");
		hashtable.put(6, "Nikki");
		hashtable.put(1, "Chetan"); 
		hashtable.put(1, 'a');
		System.out.println(hashtable);
	}
}
