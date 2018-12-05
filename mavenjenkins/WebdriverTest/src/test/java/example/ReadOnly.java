package example;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainentities.User;

public class ReadOnly extends User{

	@Override
	public String getPermission() {
		return "ReadOnly";
	}

	@Test
	public void readOnlyUserPrivsAndDefaults(){
		
		ReadOnly rod = new ReadOnly();
		assertEquals("ReadOnly", rod.getPermission());
		assertEquals("username", rod.getUsername());
		assertEquals("password", rod.getPassword());
	}

}
