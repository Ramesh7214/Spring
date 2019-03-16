package com.gbn.test;

public class UserDetails extends DBDetails {
	
	String username;
	String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Url : "+url+", username : "+username+", password: "+password;
	}
	
}
