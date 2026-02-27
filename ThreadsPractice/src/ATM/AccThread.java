package ATM;

public class AccThread {
	
	public static void main(String[] args) {
		Account acc = new Account();
		
		Thread t1 = new Thread(acc , "fred");
		Thread t2 = new Thread(acc, "john");
		Thread t3 = new Thread(acc, "martin");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
