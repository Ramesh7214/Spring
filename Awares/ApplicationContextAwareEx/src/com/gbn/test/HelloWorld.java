package com.gbn.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware {

	ApplicationContext context = null;

	public void display() {
		System.out.println("Hello world .. !");
		System.out.println("I am going to get HelloIndia instanse");
		HelloIndia helloInida = (HelloIndia) context.getBean("helloIndia");
		System.out.println("about call HelloIndia method");
		helloInida.display();
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
