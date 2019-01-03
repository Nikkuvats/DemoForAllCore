package com.DeclarationAccessControl.AbstractClassInterface;

abstract class Person {

	String name;
	int age;
	
	// 100 properties	
	
	Person(String name, int age){
	
		this.name = name;
		this.age = age;
		
	// 100 properties	
	}
}

class Student extends Person {

	Student(String name, int age) {
		super(name, age);
	
	System.out.println(name + " & " + age );	
	}

	public static void main(String[] args) {
	Student object = new Student("Aayush", 10);	
	}
}