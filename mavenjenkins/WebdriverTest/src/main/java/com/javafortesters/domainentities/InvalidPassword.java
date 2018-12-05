package com.javafortesters.domainentities;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.junit.Test;

public class InvalidPassword extends Exception {
	public InvalidPassword(String message) {
		super(message);
	}

}
