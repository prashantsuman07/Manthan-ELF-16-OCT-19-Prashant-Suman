package nov14;

import java.util.function.Predicate;

public class Testa {
	public static void main(String[] args) {
		Student s=new Student("divya",58.9,21);
		Predicate<Student> st=s1->{
			if(s1.per>=35) {
				return true;
			}else {
				return false;
			}
		};
		boolean ans=st.test(s);
//		System.out.println(st.equals(obj));
		System.out.println(ans);
		
	}
}
