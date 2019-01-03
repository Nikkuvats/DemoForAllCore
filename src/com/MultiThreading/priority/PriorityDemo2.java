package com.MultiThreading.priority;

class MyThread extends Thread {

	public void run () {
		
		/*for(int i = 0 ; i < 10 ; i++) {
			System.out.println("child thread");
		}*/
	}
}

class PriorityDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println(MyThread.currentThread().getPriority());
		MyThread th  = new MyThread();
		th.currentThread().setPriority(7);
		System.out.println(th.currentThread().getPriority());
		th.start();
		
		/*for(int i = 0 ; i < 10 ; i++) {
			System.out.println("main thread");
		}*/
	}
}
