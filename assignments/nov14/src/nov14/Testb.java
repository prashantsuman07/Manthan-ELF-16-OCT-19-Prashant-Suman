package nov14;

import java.util.function.Function;

public class Testb {
	public static void main(String[] args) {
		Function<String, Integer> fn=x->x.length();
		int ans=fn.apply("prashant");
		System.out.println("length of name is "+ ans);
	}
}
