package example;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

public class stringAsserts {

	@Test 
	public void stringsConcatenated(){ 
		assertEquals("123456", "12" + "34" + "56"); 
	}

	@Test 
	public void someStringMethods(){ 
		String aString = "abcdef";
		assertEquals(6, aString.length()); 
		assertTrue(aString.compareToIgnoreCase("ABCDEF")==0); 
		assertTrue(aString.contains("bcde")); 
		assertTrue(aString.startsWith("abc"));
		// string indexing starts at 0 
		assertEquals('c', aString.charAt(2)); 
		assertEquals("ef", aString.substring(4));
	}

	int x = 4>3 ? 2 : 1;
	//x is set to 2, if 4 is greater than 3, otherwise x is set to 1 

	@Test 
	public void moreTernary(){ 
		String url = "www.eviltester.com";

		url = url.startsWith("http") ? url : addHttp(url);
		assertTrue(url.startsWith("https://"));
		assertEquals("https://www.eviltester.com", url);

		System.out.println(url);

	}

	@Test
	public void ifaddhttp() {

		String url = "www.google.com";

		if(!url.startsWith("http")) {
			url = addHttp(url);
			System.out.println(url);
		}

		assertTrue(url.startsWith("https://"));
		assertEquals("https://www.google.com", url);

	}

	@Test 
	public void ifElseNestedAddHttp(){ 
		String url = "seleniumsimplified.com"; 
		if(url.startsWith("http")){ 
			// do nothing the url is fine 
		}else{ 
			if(!url.startsWith("www")){ 
				url = "www." + url; 
			} 
			url = addHttp(url); 
		} 
		assertTrue(url.startsWith("https://")); 
		assertEquals("https://www.seleniumsimplified.com", url); 
	}




	private String addHttp(String url) {

		url = "https://" + url;
		return url;

	}



}
