import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quest5 {
public static void main(String[] args) {
	 Dog d=new Dog();
	 Pig p=new Pig();
	ArrayList<Object> al=new ArrayList<Object>();
	al.add(p);
	al.add(d);
	al.add(p);
	al.add(d);
	al.add(p);
	al.add(d);
	System.out.println("no of pigs are "+al.stream().filter(a->a.equals(p)).count());
	System.out.println("no of dogs are "+al.stream().filter(a->a.equals(d)).count());
	
}
}
