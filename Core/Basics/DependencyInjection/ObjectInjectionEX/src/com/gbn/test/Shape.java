package com.gbn.test;

public class Shape {

	private Rectangle rectangle;
	private Circle circle;
	private Triangle triangle;

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void display() {
		
		rectangle.display();
		circle.display();
		triangle.display();

	}

}
