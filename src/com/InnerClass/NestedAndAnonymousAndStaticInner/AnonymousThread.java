package com.InnerClass.NestedAndAnonymousAndStaticInner;

public class AnonymousThread {
	
	public static void main(String[] args) {
		Thread t = new Thread()
		{
		public void run() {	
		 for (int i = 0; i < 10; i++) {
   		  System.out.println("child thread");
		 }
		}
	  };
	  t.start();
	  for(int i = 0; i < 10; i++ ) {
		 System.out.println("main thread"); 
	  }
	}
}
