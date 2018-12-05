package example;

import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

public class testfile {

	@Test
	public void testcreatefile() throws IOException {
		File outputFile = File.createTempFile("forReading", null,
				new File(System.getProperty("user.dir")));
		System.out.println(outputFile);		

	}

	@Test public void aNewFileDoesNotCreateAFile() throws IOException {
		File aTempFile = new File("D:/JavaForTesters.txt");
		assertThat(aTempFile.exists(), is(true));
		aTempFile.createNewFile(); 
		assertThat(aTempFile.exists(), is(true));

		System.out.println(aTempFile);

		aTempFile.delete(); 
		assertThat(aTempFile.exists(), is(false));

	}	
}
