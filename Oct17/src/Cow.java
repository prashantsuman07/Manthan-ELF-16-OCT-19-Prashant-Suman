
public class Cow {
	Cow(){
		System.out.println("a");
	}
	Cow(int i){
		this(2.4);
		System.out.println("b");
	}
	Cow(double r){
		this();
		System.out.println("c");
	}
}
