package com.MultiThreading.synchronize;

class Display {
	
	public static synchronized void wish(String name) {
		for(int i = 0; i < 10; i++) {
			
			System.out.print(" Good morning : ");
			try {
			Thread.sleep(2000);
			}catch(InterruptedException exception) {
			exception.printStackTrace();	
			}
			System.out.println(name);
		}
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

class SynchronizedDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();// for two object synchronization not required   
		
		MyThread th = new MyThread(d, "Dhoni");
		MyThread th2 = new MyThread(d2, "youvraj");
		
	//	MyThread th3 = new MyThread(d, "Devesh");
	//	MyThread th4 = new MyThread(d, "Shivam");
		
		th.start();
		th2.start();
	
	//	th3.start();
	//	th4.start();
	}
}
