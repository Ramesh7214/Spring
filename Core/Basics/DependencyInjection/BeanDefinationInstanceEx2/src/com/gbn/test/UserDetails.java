package com.gbn.test;

import java.util.List;

public class UserDetails extends DBDetails {
	
	List<String> dbDetails;
	
	public List<String> getDbDetails() {
		return dbDetails;
	}
	
	@Override
	public void setDbDetails(List<String> dbDetails) {
		this.dbDetails = dbDetails;
	}
	
}
