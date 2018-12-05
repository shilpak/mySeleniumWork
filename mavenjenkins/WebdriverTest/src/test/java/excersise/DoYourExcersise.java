package excersise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoYourExcersise {
	
	@Test
	public void substractTwoFromTwo() {
		int result = 2-2;
		assertEquals("2-2=0", 0, result);
	}
	
	@Test
	public void divideFourByTwo() {
		int result1 = 4/2;
		assertEquals("4/2=2", 2, result1);
	}
	
	@Test
	public void multipleTwoByTwo() {
		int result2 = 2*2;
		assertEquals("2*2", 4, result2);
	}

}
