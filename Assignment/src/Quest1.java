import java.util.function.Consumer;

public class Quest1 {
	public static void main(String[] args) {
		Object o1=new Pig();
		
		Consumer<Object> c=c1->{
			if(c1 instanceof Pig)
			{
				System.out.println("hehehehe");
			}
			else if(c1 instanceof Dog) {
				System.out.println("barkkk");
			}
		};
		c.accept(o1);
	}
}
