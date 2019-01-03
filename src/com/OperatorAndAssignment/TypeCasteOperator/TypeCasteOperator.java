package com.OperatorAndAssignment.TypeCasteOperator;

public class TypeCasteOperator {

	public static void main(String[] args) {
		
		int x = 'a';
		System.out.println(x);// compiler convert char to int by implicit typeCasting 
		
		double d = 10;
		System.out.println(d);// compiler convert int to double by implicit typeCasting
		
		// L --> R   Impilcit typeCasting is required (Up casting) no loss of information
		// L <-- R   Explicit typeCasting is required (Down Casting) loss of information
		
		int x2 = 130;
		byte b = (byte) x2;// Explicit type casting
		System.out.println(b);
	}
}
