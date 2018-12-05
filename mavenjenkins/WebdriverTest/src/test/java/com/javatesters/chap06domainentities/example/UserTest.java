package com.javatesters.chap06domainentities.example;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;

public class UserTest {

	@Test 
	public void canConstructWithUsernameAndPassword() throws InvalidPassword{
		User myuser = new User("shilpa123", "adncbfas");
		//using set we can keep changing the value
		myuser.setPassword("abc");
		System.out.println(myuser.getPassword());
		/*assertEquals("shilpa123", myuser.getUsername());
		//assertEquals("pA55w0rD", myuser.getPassword());
		assertEquals("adncbfas", myuser.getPassword());*/
	}


	/*@Test
	public void userHasDefaultUsernameAndPassword() {
		User user = new User();

		assertEquals("default username expected",
				"username",
				user.getUsername());

		assertEquals("default password expected", "password", user.getPassword());
	}*/
}
