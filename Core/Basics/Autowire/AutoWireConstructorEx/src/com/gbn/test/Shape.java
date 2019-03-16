package com.gbn.test;

public class Shape {

	private Rectangle rectangle;
	private Circle circle;
	private Triangle triangle;

	public Shape(Rectangle rectangle, Circle circle, Triangle triangle) {
		this.rectangle = rectangle;
		this.circle = circle;
		this.triangle = triangle;
	}
	
	
	public void display() {
		
		rectangle.display();
		circle.display();
		triangle.display();

	}

}
