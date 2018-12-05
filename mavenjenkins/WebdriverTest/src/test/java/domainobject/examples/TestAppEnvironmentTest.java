package domainobject.examples;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.junit.Test;
import com.jaavfortesters.domainobject.TestAppEnv;
import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;


public class TestAppEnvironmentTest {


/*	@Test 
	public void canGetUrlStatically(){

		assertEquals("Returns hard coded url",
				"http://192.123.0.3:67",

				TestAppEnv.getUrl());
	}

	@Test 
	public void canGetDomainAndPortStatically(){

		assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);

		assertEquals("Just the port", "67", TestAppEnv.PORT);
	}*/

	@Test
	public void setPasswordWithInvalidPasswordExceptionMessages(){
		User aUser = new User();
		try {
			aUser.setPassword("tiny");
			fail("An Invalid Password Exception should have been thrown");
		} catch (InvalidPassword e) {
			assertTrue(e.getMessage().startsWith("Password must be > 6 chars"));
		}
	}


}
