package com;

public class ThreadSafeDemo implements Runnable {
	
	public static synchronized void printMessage(String name) {
		for(int i=0; i<10; i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	
	
	Object obj = new Object();

	@Override
	public void run() {
		printMessage(Thread.currentThread().getName());
		
	}
	
	
	public static void main(String[] args) {
		ThreadSafeDemo obj = new ThreadSafeDemo();
		
		Thread t1 = new Thread(obj , "A");
		Thread t2 = new Thread(obj , "B");
		Thread t3 = new Thread(obj , "C");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
