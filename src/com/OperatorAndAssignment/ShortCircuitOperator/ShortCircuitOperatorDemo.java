package com.OperatorAndAssignment.ShortCircuitOperator;

public class ShortCircuitOperatorDemo {
	
		public static void main(String[] args) {
			
			int x = 10;
			int y = 15;
			
			if(++x < 10 && (x/0 > 10)) {
				System.out.println("hello");
			}
			else 
			{
				System.out.println("hii");
			}
		}
	
}
