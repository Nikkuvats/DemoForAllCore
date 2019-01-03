package com.Assertion.Inro.garbageCollection;

public class GarbageCollections {
	
	public static void main(String[] args) {
	
	//	String s = new String("durga"); GC will call finalize method on the object which is eligible
	//	for gc if String object will eligible for gc the String class finalize() will be called not object class. 
		 
		
		GarbageCollections s = new GarbageCollections();
	//	s.finalize(); finalize method we can call then it will executed jst like a normal method call 
	//	s.finalize();
		s = null;
		System.gc();
		System.out.println("end main method");
	}	
	
	public void finalize() {
		System.out.println("finalize method called");
	}
}
