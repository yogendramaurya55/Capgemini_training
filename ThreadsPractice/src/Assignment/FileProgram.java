package Assignment;

public class FileProgram {
	
	public static void main(String[] args) {
		
		CopyDataThread obj = new CopyDataThread();
		
		Thread copier = new Thread(obj);
		
		copier.start();
	}

}
