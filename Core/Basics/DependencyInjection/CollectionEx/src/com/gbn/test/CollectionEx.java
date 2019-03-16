package com.gbn.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionEx {

	private List<String> names;
	private Set<String> things;
	private Map<String, String> cityCapitals;
	Properties dbDetails;

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setThings(Set<String> things) {
		this.things = things;
	}

	public void setCityCapitals(Map<String, String> cityCapitals) {
		this.cityCapitals = cityCapitals;
	}

	public void setDbDetails(Properties dbDetails) {
		this.dbDetails = dbDetails;
	}

	public void display() {

		for (String s : names) {
			System.out.println("list - " + s);
		}

		for (String s : things) {
			System.out.println("set - " + s);
		}

		for (Map.Entry<String, String> entry : cityCapitals.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		System.out.println(dbDetails);

	}
}
