package nov14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testg {
	public static void main(String[] args) {
		String msg="hey! how you doin";
		byte[] b=msg.getBytes();
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("joey.txt");
			fout.write(b);	
			System.out.println("done");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		
}
