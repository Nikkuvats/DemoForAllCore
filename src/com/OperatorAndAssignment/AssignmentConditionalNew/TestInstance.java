package com.OperatorAndAssignment.AssignmentConditionalNew;

class Student {
	
}

class Customer {
	
}

public class TestInstance {
	
	public static void main(String[] args) throws Exception {
	
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Objected created for: " +o.getClass().getName());
		
		// to create object at runtime we use java TestInstance Customer
	}
}
