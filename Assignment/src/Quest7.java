import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Quest7 {
	public static void main(String[] args) {
		ArrayList<Double> female=new ArrayList<Double>();
		female.add(90.0);
		female.add(30.0);
		female.add(70.0);
		female.add(20.0);
		System.out.println("female passed candidates"+female.stream().filter(a->a>=35).count());
		System.out.println("female passed candidates"+female.stream().map(a->a+=35).collect(Collectors.toList()));
	}
}
