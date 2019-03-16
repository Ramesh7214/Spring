package com.gbn.test;

import org.springframework.beans.factory.annotation.Required;

public class Shape {

	private Circle circle;
	private Triangle triangle;

	@Required
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void display() {
		
		circle.display();
		triangle.display();

	}

}
