package Assignment;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataThread implements Runnable{

	@Override
	public void run() {
		
		try(FileReader reader = new FileReader("src/Assignment/source.txt");
				FileWriter writer = new FileWriter("src/Assignment/target.txt", true);){
			
			int count =0;
			
			char ch;
			
			
			while((ch = (char) reader.read()) != -1) {
				count++;
				if(count == 10) {
					System.out.println("10 characters are copied");
					Thread.sleep(1000);
					count = 0;
				}
				writer.append(ch);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
