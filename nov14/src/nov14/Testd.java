package nov14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Testd {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(8);
		Predicate<Integer> p=x->{
			if(x%2==0) {
				return false;
			}
			else {
				return true;
			}
		};
		
		b=a.stream().filter(p).collect(Collectors.toList());
		
		System.out.println(b);
	}
}
