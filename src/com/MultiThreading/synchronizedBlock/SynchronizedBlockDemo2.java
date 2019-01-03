package com.MultiThreading.synchronizedBlock;

class Displays {

	public void wish(String name) {
		
	//  !!!!!!!! 1 lakh line of the code
		
		synchronized(Displays.class) 
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

class MyThreads extends Thread {
	Displays d;
	String name;

	public MyThreads(Displays d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class SynchronizedBlockDemo2 {

	public static void main(String[] args) {
		Displays d = new Displays();
	//	Display d2 = new Display();// regular output with two display objects

		MyThreads th = new MyThreads(d, "Dhoni");
		MyThreads th2 = new MyThreads(d, "youvraj");

		// MyThread th3 = new MyThread(d, "Devesh");
		// MyThread th4 = new MyThread(d, "Shivam");

		th.start();
		th2.start();

		// th3.start();
		// th4.start();
	}
}
