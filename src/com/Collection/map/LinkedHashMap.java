package com.Collection.map;

import java.util.IdentityHashMap;

public class LinkedHashMap {
	
	public static void main(String[] args) {
		
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
	
	//	HashMap m = new HashMap(); // Meant for Value comparison
	//	m.put(I1, "Aayush"); 10
	//	m.put(I2, "Chetan"); 10 so value will be change cause of duplicate key
		
		
		IdentityHashMap m = new IdentityHashMap(); // Identity meant for address comparison
		m.put(I1, "Aayush"); // 10
		m.put(I2, "Chetan"); // 10
		System.out.println(m);// so value will not be change cause of address comparison
	}
}
