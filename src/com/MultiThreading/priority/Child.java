package com.MultiThreading.priority;

abstract class Parent {

	public abstract void display();
}

public class Child extends Parent {

	public void display() {
		System.out.println("child");
	}

	public static void main(String[] args) {

		Parent parent = new Child();
		parent.display();
	}
}
