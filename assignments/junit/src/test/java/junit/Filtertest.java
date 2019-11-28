package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Filtertest {

	@Test
	void testNames() {
		Dbutil db=mock(Dbutil.class);
		Filter f=new Filter(db);
		when(db.getNames()).thenReturn(Arrays.asList("AMIT","AVI","XaVi"));
		List<String> myList=f.myFilter();
		assertEquals(2,myList.size());
	}

}
