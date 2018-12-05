package com.javaforTesters.chap003myfirsttest.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyfirstTest {
	
	
	@Test
	public void canAddTwoPlusTwo(){
		
		 int answer = 2+2; 
		 assertEquals("2+2=4", 4, answer); 
		
	}

}
