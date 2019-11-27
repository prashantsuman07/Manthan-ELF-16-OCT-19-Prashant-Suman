package nov14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Teste {
	public static void main(String[] args) {
		Properties pr=new Properties();
		pr.setProperty("driverName", "com.mysql.jdbc.Driver");
		pr.setProperty("url","jdbc:mysql://localhost:3036");
		pr.setProperty("name", "root");
		pr.setProperty("pswd", "root");
		pr.setProperty("ceo", "oec");
		
		try {
			FileOutputStream fout=new FileOutputStream("abc.properties");
			
				pr.store(fout,"storing data");
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
