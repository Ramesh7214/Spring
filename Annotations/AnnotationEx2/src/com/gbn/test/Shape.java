package com.gbn.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Shape {

	private Triangle triangle;


	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void display() {
		triangle.display();

	}

}
