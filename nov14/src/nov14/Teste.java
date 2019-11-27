package nov14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Teste {
		public static void main(String[] args) {
	List<Integer> a=new ArrayList<Integer>();
	List<Integer> b=new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(8);
	Function<Integer, Integer> p=x-> x*10;
	b=a.stream().map(p).collect(Collectors.toList());
	
	System.out.println(b);
}
}