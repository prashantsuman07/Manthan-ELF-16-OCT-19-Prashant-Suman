import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;

public class Quest4 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);	
		System.out.println("enter train no or name");
		Map<Integer, String>m=new TreeMap<Integer, String>();
		m.put(11, "abcd");
		m.put(12, "abcde");
		m.put(13, "abcdef");
		m.put(14, "abcdefg");
		System.out.println("enter 1 for traino");
		System.out.println("enter 2 for trainame");
		int a=sc1.nextInt();
		sc1.nextLine();
		if(a==1) {
		Function<Map<Integer, String>, String> f= mi->{
			
			int tno=sc1.nextInt();
			sc1.nextLine();
			if(tno==11) {
				return mi.get(tno);
			}
			else if(tno==12){
				return mi.get(tno);
			}
			else if(tno==13){
				return mi.get(tno);
			}
			else if(tno==14){
				return mi.get(tno);
			}
			return null;
			
		};
		String s=f.apply(m);
		System.out.println(s);
		}
		else if(a==2) {
		Function<Map<Integer, String>, String> f= mi->{
			
			String tno1=sc1.nextLine();
			if(mi.containsValue(tno1)) {
				return tno1;
			}
			return null;
			
		};
		String s=f.apply(m);
		System.out.println(s);
		}
		
		
	}
}
