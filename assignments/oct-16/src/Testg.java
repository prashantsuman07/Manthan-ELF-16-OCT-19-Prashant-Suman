
public class Testg {
public static void main(String[] args) {
	Card r=new Card();
	Card k=new Card();
	Card m=new Card();
	r.swipe();
	m.swipe();
	r.swipe();
	k.swipe();
	r.swipe();
	k.swipe();
	System.out.println(Card.orgcount);
	System.out.println(r.count );
}
}
