package com.abc.dto;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String username;
	String password;
	
	public User() {

	}
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
