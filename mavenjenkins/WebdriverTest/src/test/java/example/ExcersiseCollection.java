package example;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.javafortesters.domainentities.User;

public class ExcersiseCollection {

	@Test
	public void createAndManipulateACollectionOfUsers(){
	Collection<User> someUsers = new ArrayList<User>();
	assertEquals(0, someUsers.size());
	assertTrue(someUsers.isEmpty());
	User bob = new User("bob", "Passw0rd");
	User eris = new User("eris","Cha0sTime");
	someUsers.add(bob);
	someUsers.add(eris);

	System.out.println(someUsers.size());
	assertFalse(someUsers.isEmpty());
	
	Collection<User> someUsers1 = new ArrayList<User>();
	
	User adam = new User("adam", "Passw0rd1");
	User chris = new User("chris","Cha0sTime1");
	someUsers1.add(adam);
	someUsers1.add(chris);
	
	someUsers.addAll(someUsers1);
	System.out.println(someUsers.size());
	
	someUsers1.removeAll(someUsers1);
	System.out.println(someUsers);
	
	
	/*someUsers.clear();
	
	assertTrue(someUsers.isEmpty());
	*/
	}
}
