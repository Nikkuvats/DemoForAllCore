package com.MultiThreading.synchronizedBlock;

class Display {

	public void wish(String name) {
		
	//  !!!!!!!! 1 lakh line of the code
		
		synchronized(this) 
		{
			for (int i = 0; i < 10; i++) {
				System.out.print(" Good morning : ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException exception) {
					exception.printStackTrace();
				}
				System.out.println(name);
			}	
		}
	// !!!!!!!! 1 lakh line of the code	
	}	
}

class MyThread extends Thread {
	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display d = new Display();
	//	Display d2 = new Display();// Irregular output with two display objects

		MyThread th = new MyThread(d, "Dhoni");
		MyThread th2 = new MyThread(d, "youvraj");

		// MyThread th3 = new MyThread(d, "Devesh");
		// MyThread th4 = new MyThread(d, "Shivam");

		th.start();
		th2.start();

		// th3.start();
		// th4.start();
	}
}
