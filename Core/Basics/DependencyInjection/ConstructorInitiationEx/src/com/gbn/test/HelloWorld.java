package com.gbn.test;

public class HelloWorld {
	
	private String name;
	private int a;
	
	public HelloWorld(String name, int a)
	{
		this.name = name;
		this.a = a;
	}
	
	public void display()
	{
		System.out.println("name : "+name+", A = "+a);
	}

}
