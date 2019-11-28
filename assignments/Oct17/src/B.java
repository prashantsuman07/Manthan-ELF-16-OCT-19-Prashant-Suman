
public class B extends A{
	int i=50;
void m() {
	int i=60;
	System.out.println(i);
	System.out.println(this.i);
	System.out.println(super.i);
}
}
