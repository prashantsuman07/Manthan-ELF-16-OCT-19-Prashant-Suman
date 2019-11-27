package nov14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Testf {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(8);
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		int b=a.stream().max(c).get();
		int c1=a.stream().min(c).get();
		System.out.println(b);
		System.out.println(c1);
	}
}
