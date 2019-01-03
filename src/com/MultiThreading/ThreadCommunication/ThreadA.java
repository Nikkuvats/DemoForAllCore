package com.MultiThreading.ThreadCommunication;

class ThreadA  {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB obj = new ThreadB();
		obj.start();
		
		//obj.sleep(1000); 
		/*try {
			obj.join(); // expecting some updation calling join() is not recommended
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println(obj.total);
	}
}

class ThreadB extends Thread {
	int total = 0;
	public void run() {	
		for(int i = 1; i <= 100; i++) {
			total = total + i;
		}
		
		// 1 crore line code is here
	}
}


 