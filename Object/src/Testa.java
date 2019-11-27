
public class Testa {
	 public static void main(String[] args) {
		Student s=new Student("abc",1,8.0);
		Student s1=new Student("abc",1,8.0);
		
		System.out.println(s1.hashCode());
		
		System.out.println(s);
		boolean b=s1.equals(s);
		System.out.println(b);
		
	}
}
