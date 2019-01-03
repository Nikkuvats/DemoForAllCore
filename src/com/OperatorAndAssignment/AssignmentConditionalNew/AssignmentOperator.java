package com.OperatorAndAssignment.AssignmentConditionalNew;

public class AssignmentOperator {
	public static void main(String[] args) {

	//  Simple Assignment
		int x = 10;
		System.out.println(x);
	
	//  Chained Assignment 
		int a,b,c,d;
		a = b = c = d = 20;
        System.out.println(a + " " +b+ " " +c+ " " +d);
        
    //  Compound Assignment
        a += 20; 
        a -= 20;
        a *= 20;
        a %= 20;
        a /= 20;
        a &= 10;
        a ^= 20;
        a |= 20;
        System.out.println(a);
        
        byte by = 127;
    //  by = by + 1; // compile time error possible loss info type bcomes byte + int => int
        by += 3; // Implicit typeCasting so by = byte (by + 1);
        System.out.println(by);
        
	}
}
