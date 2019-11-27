import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Quest3 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);	
	System.out.println("enter 1 for ArrayList");
	System.out.println("enter 2 for LinkedList");
	System.out.println("enter 3 for Vector");
	 ArrayList<Integer>al=new ArrayList<Integer>();
	 al.add(1);
	 al.add(2);
	 LinkedList<Integer>ll=new LinkedList<Integer>();
	 ll.add(3);
	 ll.add(4);
	 Vector<Integer>v=new Vector<Integer>();
	 v.add(5);
	 v.add(6);
	
	Supplier<Object> sc=()->{
		int id=sc1.nextInt();
		if(id==1) {
			return al;
		}
		else if(id==2) {
			return ll;
		}
		else if(id==3) {
			return v;
		}
		return null;
	};
Object s=sc.get();
System.out.println(s);
}
}

