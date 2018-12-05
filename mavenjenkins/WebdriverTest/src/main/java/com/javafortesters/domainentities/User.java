package com.javafortesters.domainentities;

public class User {
	//fields or field variables.		
	private String username;
	private String password;

	public User() {
		this("username", "password");
	}

	public User(String username, String password) {	
		this.username = username; 
		this.password = password;	
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setPassword(String password) throws  InvalidPassword{
		if(password.length()<7){
			throw new InvalidPassword("Password must be > 6 chars");
			}
		this.password = password; 
	}

	public String getPermission() {
		// TODO Auto-generated method stub
		return "normal";
	}
	
	

}
