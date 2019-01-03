package com.OperatorAndAssignment.BitwiseOperator;

class BitwiseOperatorDemo {
	
	public static void main(String[] args) {
		
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);
		
		System.out.println(4 & 5); //  100 AND 101 => 100  => 4
		System.out.println(4 | 5); //  100 OR 101 => 101 => 5
		System.out.println(4 ^ 5); //  100 XOR 101 => 001 => 1
		
	}
}