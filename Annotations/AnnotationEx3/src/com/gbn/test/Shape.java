package com.gbn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Shape {

	private Triangle triangle;


	@Autowired
	@Qualifier("triangleBean1")
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void display() {
		triangle.display();

	}

}
