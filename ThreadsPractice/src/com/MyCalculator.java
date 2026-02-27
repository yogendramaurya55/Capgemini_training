package com;

public class MyCalculator implements Runnable {

	@Override
	public void run() {
		int total = 0;
		synchronized(this) {
			for(int i=0; i<100; i++) {
				total += i;
			}
		}
		
	}
	
	
	

}
