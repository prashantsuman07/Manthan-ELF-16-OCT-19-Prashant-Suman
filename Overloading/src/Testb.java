
public class Testb {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("abcd");
		Db d=new Db();
		d.save(s);
	}
}
