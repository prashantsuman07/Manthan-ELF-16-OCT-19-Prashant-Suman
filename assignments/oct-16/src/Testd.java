
public class Testd {
	public static void main(String[] args) {
		Cow i=new Cow();
		Cow j=new Cow();
		j.name="buffalow";
		i.name="lying";
		j.eat();
		i.eat();
		System.out.println("i am "+j.name);
		System.out.println("and i am"+i.name);
	}
}
