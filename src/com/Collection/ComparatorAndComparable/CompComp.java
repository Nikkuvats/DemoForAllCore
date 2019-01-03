package com.Collection.ComparatorAndComparable;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{

	String name;
	int end;
	
	public Employee(String name, int emnd) {
		
		this.name = name;
		this.end = end;
	}
	
	public String toString() {
	
	return name+ " " +end;	
	}

	@Override
	public int compareTo(Object o) {

		int end1 = this.end;
		Employee e = (Employee) o;
		
		int end2 = e.end;
		
	return 0;
	}
}

public class CompComp {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Aayush", 100);
		Employee e2 = new Employee("Mahesh", 200);
		Employee e3 = new Employee("Durga", 50);
		Employee e4 = new Employee("Chetan", 100);
		Employee e5 = new Employee("Shivam", 100);
		
		TreeSet set = new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		System.out.println(set);
		
		TreeSet sets = new TreeSet(new MyComparator());
		sets.add(e1);
		sets.add(e2);
		sets.add(e3);
		sets.add(e4);
		sets.add(e5);
		System.out.println(set);
	}
}
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		return e1.compareTo(e2);
	}
}