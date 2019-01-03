package com.Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Object put(Object key, Object value)
// putAll(Map m)
// Object get(Object key)
// Object remove(Object key)
// boolean containsKey(Object key)
// boolean isEmpty()
// int size()
// void clear()
// Set keySet()
// Collection values()
// Set entrySet()

class hashMapDemo {

	public static void main(String[] args) {

//		HashMap map = new HashMap(initialcapacity, float fillRatio);
//		HashMap map = new HashMap(initialcapacity);

		HashMap<Integer, String> map = new HashMap<Integer, String>(); // creates a empty hashmap with a default initial
																		// capacity 16 and fill ratio 0.75
		
		
		map.put(1, "Aayush");
		map.put(3, "Nikki");
		map.put(3, "Anant");
		map.put(2, "Vinay");
		map.put(6, "Nikku");
		map.put(1, "Chetan"); // replace with new value so at place key 1 new value will be Chetan
		System.out.println(map);
	//	System.out.println(map.keySet());
	//	System.out.println(map.entrySet());
	//	System.out.println(map.values());

		Set s = map.entrySet();
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			Map.Entry m1 = (Entry) iterator.next();
			if (m1.getKey().equals(6)) {
				m1.setValue("Aastha");
			}
		}
	//	System.out.println(map);
	}
}