package junit;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	private Dbutil dbutil;

	public Filter(Dbutil dbutil) {
		this.dbutil = dbutil;
	}
	public List<String> myFilter(){
		List<String> newList=new ArrayList<String>();
		List<String> fromdb=dbutil.getNames();
		for(String name:fromdb) {
			if(name.startsWith("A")) {
				newList.add(name);
			}
		}
	return newList;	
	}

}
