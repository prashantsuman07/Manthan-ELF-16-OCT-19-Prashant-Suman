
public class Testd {
 public static void main(String[] args) {
	Animal a=new Cow();
	Cow c=(Cow)a;
	c.cost=20;
	c.size=24.4;
	c.eat();
	c.run();
	System.out.println(c.cost);
	System.out.println(c.size);
	
}
}
