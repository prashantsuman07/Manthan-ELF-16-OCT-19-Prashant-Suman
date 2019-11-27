
public class Testb {
public static void main(String[] args) {
	Van v=new Van();
	v.cost=50;
	v.model="cruise";
	v.move();
	v.stop();
	System.out.println(v.cost );
	System.out.println(v.model);
}
}
