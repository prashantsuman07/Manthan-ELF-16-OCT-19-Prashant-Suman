package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalciTest {
	private Calci c;
	
	@BeforeEach
	public void createObj() {
		c=new Calci();
	}
	@Test
	public void testAdd() {
		double a=c.add(2,2);
		assertEquals(4.0, a);
	}
	
	@Test
	public void testDiv() {
		double a=c.div(2,2);
		assertEquals(1, a);
	}
	@Test
	@Disabled
	public void testDivZero() {
		assertThrows(ArithmeticException.class, ()->c.div(10, 0));
		
	}

}
