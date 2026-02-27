package practice;

public class CustomThread implements Runnable {

	
	
	
	public static void main(String[] args)  {
		
		CustomThread obj = new CustomThread();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		t1.interrupt();
		t2.start();
		t3.start();
		
		
	}

	@Override
	public void run() {
//		System.out.print(Thread.currentThread().getName());
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				System.out.println("Thread intrupted");
			}
		}
		
	}

}
