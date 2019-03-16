package com.gbn.test;

public class DataSource {

	String url;
	String userName;
	String password;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "url : "+url+", username : "+userName+", password :"+password;
	}
}
