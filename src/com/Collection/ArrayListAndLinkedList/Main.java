package com.Collection.ArrayListAndLinkedList;

class MySingleton {
	static MySingleton instance = null;

	private MySingleton() {
		
	}

	static public MySingleton getInstance() {
		if (instance == null)
			instance = new MySingleton();

		return instance;
	}
}
public class Main {
	public static void main(String args[]) {
		MySingleton a = MySingleton.getInstance();
	}
}