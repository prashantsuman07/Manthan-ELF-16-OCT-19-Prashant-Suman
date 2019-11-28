package junit;

import java.util.ArrayList;
import java.util.List;

public class Dbutilimpl implements Dbutil {

	@Override
	public List<String> getNames() {
		List<String> l=new ArrayList<String>();
		l.add("AVI");
		l.add("ABcd");
		l.add("Xavi");
		
		
		return null;
		
	}

}
