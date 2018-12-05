package excersise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HexToString {
	
	@Test
	public void convertHexToString() {
		Integer aa = 6; 
		System.out.println(aa.intValue());

		
		int i = 21;
		
		System.out.println(Integer.toHexString(i));
		
		long l = 11;
		
		System.out.println(Long.toHexString(l));
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
	}

}

