package nov14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testf {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("abc.properties");
			Properties pr=new Properties();
				pr.load(fin); 
			String user=pr.getProperty("name");
			System.out.println(user);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
