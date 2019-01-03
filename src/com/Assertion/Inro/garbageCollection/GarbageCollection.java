package com.Assertion.Inro.garbageCollection;

class Students {

}
public class GarbageCollection {
	
	public static void main(String[] args) {
		Students s = m1();// only one object elligble for gc
		m1();// both object elligble for gc	
	}

	private static Students m1() {
	
	Students s1 = new Students();
	Students s2 = new Students();
	//System.gc();
	//Runtime object .gc();
	return s1;
	}
}
