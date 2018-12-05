package example;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class testClassProperties {
	
	@Test
	public void testproperties() throws IOException {
		Properties properties = new Properties();
		
		assertThat(properties.size(), is(0));
		
		properties.setProperty("browser", "chrome");
		
		properties.getProperty("browser");
		properties.list(System.out);
		assertThat(properties.getProperty("browser"), is("chrome"));
		
		for(String key : properties.stringPropertyNames()) {
			System.out.println(key + ' ' + properties.getProperty(key));
			
			String workingDirectory = System.getProperty("user.dir");
			String resourceFilePath = workingDirectory + "/src/test/resources/" + 
			"property_files/" + 
					"static_example.properties";
			
			Properties sys = System.getProperties(); 
			//sys.list(System.out);
			
			String tempDirectory = System.getProperty("java.io.tmpdir"); 
			String tempResourceFilePath = new File(tempDirectory, "tempFileForPropertiesStoreTest.properties").getAbsolutePath();
			
			System.out.println(tempResourceFilePath);
			
			Properties saved = new Properties();
			FileOutputStream outputFile = new FileOutputStream(tempResourceFilePath); 
			saved.store(outputFile, "Hello There World"); 
			outputFile.close();		
			}
	}

}
