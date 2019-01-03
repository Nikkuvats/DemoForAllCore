package com.Collection.ArrayListAndLinkedList;

public class Vectors {

	public static void main(String[] args) {

		// Every method present in vector is synchronized
		// not multithreaded
		// thread safe
		// introduced in 1.0 version and it is legacy

		java.util.Vector vector = new java.util.Vector<>(); // empty vector object with initial capacity 10

		java.util.Vector v = new java.util.Vector(10, 2); // only 2 vector capacity will increase after 10 elements
		java.util.Vector vs = new java.util.Vector(1000, 10); // only 10 vector capacity will increase after 1000
																// elements

		vector.add("Aayush");
		vector.add(1);
		vector.add('z');
		vector.add(2, "chetan");
		// System.out.println(vector);

		// System.out.println(vector.capacity());

		for (int i = 0; i <= 15; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
	}
}
