package com.gbn.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/*
 * make sure that spring configuration file at root in case of BeanFactory
 */

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		helloWorld.display();
	}
}
