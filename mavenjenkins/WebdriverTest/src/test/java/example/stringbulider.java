package example;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class stringbulider {

	@Test
	public void stringbuilderTest() {
		StringBuilder builder = new StringBuilder();

		builder.append("Hello There").
		replace(7,11,"world").delete(5,7);
		assertThat(builder.toString(), is("Helloworld"));
		System.out.println(builder);

		StringBuilder builders = new StringBuilder("123890"); 
		builders.insert(3,"4567"); 
		assertThat(builders.toString(), is("1234567890"));

		StringBuilder repbuilder = new StringBuilder("abcdefgh"); 
		repbuilder.replace(0,4,"12345678"); 

		assertThat(repbuilder.toString(), is("12345678efgh"));

		StringBuilder setCharbuilder = new StringBuilder("012345678"); 
		setCharbuilder.setCharAt(5,'f'); 
		assertThat(setCharbuilder.toString(), is("01234f678"));

		StringBuilder revbuilder = new StringBuilder("0123456789"); 
		System.out.println(revbuilder.reverse().toString());

		StringBuilder subuilder = new StringBuilder("0123456789");
		System.out.println(subuilder.substring(3, 7));


	}
}
