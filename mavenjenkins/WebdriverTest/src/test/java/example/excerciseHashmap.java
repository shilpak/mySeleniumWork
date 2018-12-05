package example;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.javafortesters.domainentities.User;

public class excerciseHashmap {
	
	@Test
	public void createAndManipulatehashmap() {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("key1", "value1"); 
		map.put("key2", "value1"); 
		map.put("key3", "value3");

		
		Collection<String> values = map.values();
		Set<String> keys = map.keySet();
		Set<Map.Entry<String,String>> entries = map.entrySet();

		
		System.out.println(values);
		System.out.println(keys);
		System.out.println(entries);
		
		for( Map.Entry<String,String> entry : entries){ 
			entry.setValue("bob"); 
			System.out.println(entry);
			}

		Map<Object,User> map1 = new HashMap<>();
		User bob = new User("bob", "Passw0rd");
		User eris = new User("eris","Cha0sTime");
		
		map1.put("key1", bob);
		map1.put("key1", eris);
		System.out.println(map1);
		
		assertEquals(1, map1.size());
	}

}
