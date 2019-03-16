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

	public void myInit() {
		System.out.println("bean initated. myInit called");

	}

	public void cleanUp() {
		System.out.println("claenup done..! cleanUp method called");
	}

}
