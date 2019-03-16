package com.gbn.test;

import org.springframework.beans.factory.BeanNameAware;

public class HelloWorld implements BeanNameAware{
	
	String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}
	
	public void display() {
		System.out.println("Bean name is :" +beanName);
	}
}
