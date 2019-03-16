package com.gbn.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Shape {

	private Triangle triangle;
	private Triangle myTriangle;

	@Resource
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	@Resource(name = "triangleBean2")
	public void setMyTriangle(Triangle myTriangle) {
		this.myTriangle = myTriangle;
	}

	public void display() {
		triangle.display();
		myTriangle.display();

	}

	@PostConstruct
	public void myInit() {
		System.out.println("Bean Initiated..!");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Bean Destoryed..!");
	}

}
