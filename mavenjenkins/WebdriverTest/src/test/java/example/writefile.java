package example;

import java.io.BufferedWriter;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class writefile {

	@Test
	public void testwriteFile() throws IOException {
		File outputFile = File.createTempFile("printWriter", null);
		FileWriter writer = new FileWriter(outputFile); 
		BufferedWriter buffer = new BufferedWriter(writer); 
		PrintWriter print = new PrintWriter(buffer);

		print.println("Simple Print to Buffered Writer"); 
		print.println("===============================");
		print.close();
		/*File outputFile1 = new File("fileWriter",null);
		FileWriter fileWriter = new FileWriter(outputFile1); 
		fileWriter.write("Simple Report With OutputWriter"); 
		fileWriter.write("==============================="); 
		fileWriter.close();*/

		String tempDir = System.getProperty("java.io.tmpdir"); 
		System.out.println(tempDir);
		File aDirectory = Paths.get(tempDir, Long.toString(System.currentTimeMillis()), 
				Long.toString(System.currentTimeMillis())).toFile();
		System.out.println(aDirectory);
		assertThat(aDirectory.mkdirs(), is(true));	

	}

	//to get the list of temp file
	@Test
	public void listTempDirectory() {
		File tempDirlist = new File(System.getProperty("java.io.tmpdir"));

		File[] filelist = tempDirlist.listFiles();
		for(File file : filelist) {
			System.out.println(file);
		}
	}




}
