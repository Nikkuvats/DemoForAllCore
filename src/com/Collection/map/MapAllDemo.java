package com.Collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapAllDemo {

	public static void main(String[] args) {

		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			x.add(i);
		}

		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int j = 5; j < 11; j++) {
			y.add(j);
		}

		map.put(1, x);
		map.put(2, y);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue(2));

		System.out.println(map.size());
		System.out.println(map.values());

		//map.remove(2);
		for (Entry<Integer, ArrayList<Integer>> ma : map.entrySet()) {
			System.out.println(ma);

			if(ma.getKey()==2) {
				System.out.println(ma.getValue());
			}
		}
	}
}
