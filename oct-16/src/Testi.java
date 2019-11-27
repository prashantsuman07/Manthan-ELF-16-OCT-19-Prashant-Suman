
public class Testi {
public static void main(String[] args) {
	System.out.println("third gen stuffs");
	Thirdg t=new Thirdg();
	t.camera();
	t.call();
	t.msg();
	t.radio();
	System.out.println("sec gen stuffs");
	Secg s=new Secg();
	s.call();
	s.msg();
	s.radio();
	System.out.println("First gen stuffs");
	Firstg f=new Firstg();
	f.call();
	f.msg();
	
}
}
