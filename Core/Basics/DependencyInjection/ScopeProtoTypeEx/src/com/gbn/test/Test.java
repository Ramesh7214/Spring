package com.gbn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld1);
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld2);
	}
}	
