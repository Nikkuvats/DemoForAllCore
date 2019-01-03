package com.MultiThreading.intro;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.println("child method");
		}
	}
}

class ThreadDemo2 {
	
	public static void main(String[] args) {
		
		MyRunnable mRunnable = new MyRunnable();
		Thread t = new Thread(mRunnable);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main method");
		}
	}
}
