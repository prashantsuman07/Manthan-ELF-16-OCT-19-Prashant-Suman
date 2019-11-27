package nov14;

import java.io.FileWriter;
import java.io.IOException;

public class Testc {
public static void main(String[] args) {
	String msg="joey doesnt share food";
	char ch[]=msg.toCharArray();
	try (FileWriter fw=new FileWriter("joey1.txt")) {
		
		fw.write(ch);
		System.out.println("done");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
