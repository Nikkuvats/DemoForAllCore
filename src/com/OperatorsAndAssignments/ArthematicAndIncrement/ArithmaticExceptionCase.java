package com.OperatorsAndAssignments.ArthematicAndIncrement;

public class ArithmaticExceptionCase {

	public static void main(String[] args) {
		
		System.out.println(10 > Float.NaN);
		System.out.println(10/0.0);
		System.out.println(0.0/0);
		System.out.println(-10.0/0);
		System.out.println(-0.0/0);
		
		System.out.println(10 < Float.NaN);
		System.out.println(10 <= Float.NaN);
		System.out.println(10 > Float.NaN);
		System.out.println(10 >= Float.NaN);
		System.out.println(10 == Float.NaN);
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);

	}
}
