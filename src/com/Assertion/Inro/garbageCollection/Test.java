package com.Assertion.Inro.garbageCollection;

class Test {
	
	public static void main(String[] args) {
		
	int x = 10;
	assert (x > 10);
	//assert (x == 10): ++x;	
	System.out.println(x);
	}
	
	public static int m1() {
		return 777;
	}
}

//	javac Test.java
//  java -ea Test
//	RE: AssertionError: Here x value should be > 10 but it is not