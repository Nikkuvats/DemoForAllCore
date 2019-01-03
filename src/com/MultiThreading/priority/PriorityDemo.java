package com.MultiThreading.priority;

class PriorityDemo extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println(PriorityDemo.currentThread().getPriority());// default priority for main thread is 5
	//	PriorityDemo.currentThread().setPriority(15); RE : IllegalArgumentEception
	//  between 1 to 10 we can only set priority for a thread	
	
		PriorityDemo.currentThread().setPriority(8);
		PriorityDemo obj = new PriorityDemo();
		System.out.println(obj.getPriority());
	}
}