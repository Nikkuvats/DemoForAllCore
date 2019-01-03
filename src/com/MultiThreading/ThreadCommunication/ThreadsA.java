package com.MultiThreading.ThreadCommunication;

class ThreadsA {

	public static void main(String[] args) throws InterruptedException {

		ThreadsB obj = new ThreadsB();
		obj.start();
		Thread.sleep(10000);
		synchronized (obj) {
			System.out.println("main thread trying to call wait method");
			obj.wait(1000);
			System.out.println("main thread got notification");
			System.out.println(obj.total);
		}
	}
}

class ThreadsB extends Thread {
	int total = 0;

	public void run() {
		
		synchronized (this) {
			System.out.println("child threads starting calculation");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child threads trying to giveing notification");
			this.notify();
		}
		// 1 crore line code is here
	}
}
