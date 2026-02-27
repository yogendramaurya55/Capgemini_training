package ATM;

public class Account implements Runnable{

	static int balance = 20000;
	@Override
	public void run() {
		withdraw(Thread.currentThread().getName() , 10000);
	}
	
	
	public static  void withdraw(String name , int amount){
		synchronized(Object.class){
			
			//this - refers to current object 
			//for the static method we have to pass the Context of the class
			if(amount < balance) {
				System.out.println("Money withdrawn successfully " + amount);
				balance -= amount;
			}else {
				System.out.println("insufficent balance");
			}
		}
		
		System.out.println("Available balance is : " + balance);
	}

}
