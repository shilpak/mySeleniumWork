package example;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



import com.javafortesters.domainentities.User;



//Assert on the indexOf positions of the User objects � remove the first User object


public class ExcerciseList {
	
	@Test
	public void createAndManipulateAListOfUsers() {
		
		List <User> list = new ArrayList<>();
		
		User bob = new User("bob", "Passw0rd");
		User eris = new User("eris","Cha0sTime");
		
		list.add(bob);
		list.add(0, eris);
		
		System.out.println(list.size());
		assertEquals(0, list.indexOf(eris));
		assertEquals(1, list.indexOf(bob));
		
		list.remove(0);
		System.out.println(list.size());
		
		
	}

}
