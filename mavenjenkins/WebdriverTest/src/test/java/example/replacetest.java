package example;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class replacetest {
	
	@Test
	public void manipulatingString() {
		String hello = "Hello fella fella fella";
		assertThat( hello.replace("fella", "World"), is("Hello World World World"));
		
		assertThat( hello.replaceAll("fella", "World"), is("Hello World World World"));
		
		assertThat("1,2,3".replaceFirst("[0-9]","digit"), is("digit,2,3"));
		
		assertThat("1,2,3".replaceAll("[0-9]", "digit"), is("digit,digit,digit"));
		
		String text = "In the lower 3rd";
		System.out.println(text.toUpperCase());
		
		assertThat(text.toUpperCase(),is("IN THE LOWER 3RD"));
		
		String padded = "  trim me ";
		int res = padded.length();
		
		System.out.println(res);
		
		String trimmed = padded.trim();
		
		int result = trimmed.length();
		
		System.out.println(trimmed);
		System.out.println(result);
		
		assertThat(trimmed.length(), is(7)); 
		assertThat(trimmed, is("trim me"));

		String digits = "0123456789";
				
		assertThat(digits.substring(2), is("23456789"));
		
		assertThat(digits.substring(5, 6), is("5"));
		
		String csv="1,2,3,4,5,6,7,8,9,10"; 
		String[] csvres = csv.split(",");
		
		System.out.println(Arrays.toString(csvres));
				
	}

	
}
