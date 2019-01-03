package com.OperatorAndAssignment.ShortCircuitOperator;

public class ShortCircuitOperator {
	
	public static void main(String[] args) {
		
//		System.out.println(5 && 5); not apply
		System.out.println(5 & 5);
		
		int x = 10;
		int y = 15;
		
//		if(++x < 10 || ++y > 15)
//		if(++x < 10 & ++y > 15)
//		if(++x < 10 && ++y > 15)
		
		if(++x < 10 | ++y > 15) {
			x++;
		}
		else 
		{
			y++;
		}
		System.out.println(x + " .....  " + y);
	}
}
