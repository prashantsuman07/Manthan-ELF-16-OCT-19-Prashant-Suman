
public class Marker extends Pen {
	Marker(){
		this(2);
		System.out.println("b");
	}
	Marker(int x){
		//super(5);
		System.out.println("n");
	}
	Marker(double x){
		super(2);
		System.out.println("i");
	}
}
