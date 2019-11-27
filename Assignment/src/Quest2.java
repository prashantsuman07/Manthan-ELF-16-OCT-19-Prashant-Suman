import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.xml.soap.SAAJResult;

import java.util.ArrayList;

public class Quest2 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);	
		System.out.println("enter 1 for kurkure");
		System.out.println("enter 2 for bingo");
		System.out.println("enter 3 for lays");
		Supplier<String> sc=()->{
			int id=sc1.nextInt();
			if(id==1) {
				return "kurkure";
			}
			else if(id==2) {
				return "bingo";
			}
			else if(id==3) {
				return "Lays";
			}
			return null;
		};
	String s=sc.get();
	System.out.println(s);
	}
}
