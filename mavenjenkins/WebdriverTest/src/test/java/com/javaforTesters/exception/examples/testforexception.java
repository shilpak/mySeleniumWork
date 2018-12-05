package com.javaforTesters.exception.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testforexception {

	/*@Test
	public void thrownullPointerException() {

		Integer age = 18;

		String ageAsString = age.toString();

		String yourAge = "You are " + age + " year old";

		System.out.println(yourAge);

		assertEquals("You are 18 year old", yourAge);
	}*/

	/*@Test 
	public void catchANullPointerException(){ 
		Integer age=null; 
		String ageAsString;
	try{ 
		ageAsString = age.toString();
	}catch(NullPointerException e){ 
		age = 18; 
		ageAsString = age.toString(); 
		System.out.println("getMessage - " + e.getMessage()); 
		System.out.println("getStacktrace - " + e.getStackTrace()); 
		System.out.println("printStackTrace"); e.printStackTrace();
		System.out.println("Stack Trace Length - " +
				e.getStackTrace().length);
				System.out.println("Stack Trace [0] classname - " +
				e.getStackTrace()[0].getClassName());
				System.out.println("Stack Trace [0] filename - " +
				e.getStackTrace()[0].getFileName());
				System.out.println("Stack Trace [0] linenumber - " +
				e.getStackTrace()[0].getLineNumber());
				System.out.println("Stack Trace [0] methodname - " +
				e.getStackTrace()[0].getMethodName());
	}catch(IllegalArgumentException e)
	{ 
		System.out.println("Illegal Argument: " + e.getMessage()); 
	}

	String yourAge = "You are " + age.toString() + " years old";
	System.out.println(yourAge);
	assertEquals("You are 18 years old", yourAge);*/

	@Test(expected = NullPointerException.class)  
	public void nullPointerExceptionExpected(){ 
		Integer age=null; 
		age.toString(); 
		
		
		}
 

	}
	
























