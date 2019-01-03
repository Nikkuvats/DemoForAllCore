package com.MultiThreading.intro;

class MyThread extends Thread
{
	// by default run method of thread class has empty implementation
	
	public void run () {
		
		for(int i = 1; i < 10; i++ ) {
			
			System.out.println("this line executed by" + Thread.currentThread().getName());
			
			System.out.println("child thread");
		}
	}
	
	/*public void start() {
	//	super.start();
		System.out.println("start");
	}*/
	
	public void run (int i) {
		System.out.println("no-arg");
	}
}

class ThreadDemo {
	
	public static void main(String[] args) {
	
		
	//  System.out.println(Thread.currentThread().getName()); Current thread name
		
	//	Thread.currentThread().setName("Aayush vats");
		
	//	System.out.println(Thread.currentThread().getName());
		
	// main method is not thread but it execute by main thread here are main thread instiantiating child thread 
		
		MyThread object = new MyThread();// Thread initation
	   
    //  Thread t = new Thread(object); 
		
		object.start();// Starting of a thread

	//    System.out.println(object.getName());
	    
	//  t.start();// another way to execute thread
	    		
	//	If you try to restart thread 
	//	object.start();  RE:  java.lang.IllegalThreadStateException
		
		
		// Two thread are here one is main thread and one is child thread
		
		for(int i = 0; i < 10; i++) {
			System.out.println("this line executed by" + Thread.currentThread().getName());
			System.out.println("main thread");
		}
	}
}