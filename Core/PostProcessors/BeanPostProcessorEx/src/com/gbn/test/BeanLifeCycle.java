package com.gbn.test;

public class BeanLifeCycle {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
