package nov14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Testc {
	public static void main(String[] args) {
		Supplier<Student> sp=()->new Student("divya",58.9,21);
		Student s=sp.get();
		System.out.println(s.age);
	}
	
}
