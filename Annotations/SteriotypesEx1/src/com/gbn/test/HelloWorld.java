package com.gbn.test;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private  String name;
	
	public  void display() {
		System.out.println("Hey..! Hello!");
	}

}
