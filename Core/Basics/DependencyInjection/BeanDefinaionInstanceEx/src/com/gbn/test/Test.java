package com.gbn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		UserDetails userdetails = (UserDetails) context.getBean("userDetails");
		System.out.println(userdetails);

	}

}
