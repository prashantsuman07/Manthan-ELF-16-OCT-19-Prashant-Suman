import java.util.ArrayList;
import java.util.Comparator;

public class Quest6 {
public static void main(String[] args) {
	ArrayList<Double> male=new ArrayList<Double>();
	ArrayList<Double> female=new ArrayList<Double>();
	male.add(100.0);
	male.add(99.9);
	male.add(99.0);
	female.add(90.0);
	female.add(30.0);
	female.add(70.0);
	female.add(20.0);
	Comparator<Double> c=(i,j)->i.compareTo(j);
	System.out.println("male topper "+male.stream().max(c).get());
	System.out.println("female topper "+female.stream().max(c).get());
}
}
