package com.MultiThreading.priority;

class MyThread4 extends Thread {

	public void run () {
		
		for (int i = 0; i < 10 ;  i++) {
			
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class JoinDemo {
	public static void main(String[] args) {
		
		MyThread4 th = new MyThread4();
		th.start();
		
		try {
		//	th.join();
			th.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
