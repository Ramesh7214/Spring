package com.gbn.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		BeanLifeCycle beanLifeCycle = (BeanLifeCycle) context.getBean("beanLifeCycle");
		System.out.println(beanLifeCycle);
	}
}
