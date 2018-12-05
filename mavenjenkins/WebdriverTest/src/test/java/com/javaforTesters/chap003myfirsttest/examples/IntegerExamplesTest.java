package com.javaforTesters.chap003myfirsttest.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerExamplesTest {

	@Test 
	public void integerExploration(){ 

		Integer num = new Integer(4);
		
		System.out.println(num);

		assertEquals("intValue returns int 4", 4, num.intValue());

		Integer st = new Integer("5");

		assertEquals("intValue returns int 5", 5, st.intValue());
		
		Integer six = 6;
		
		assertEquals("autoboxing assignment for 6", 6, six.intValue());
		
	}
	
	

}
