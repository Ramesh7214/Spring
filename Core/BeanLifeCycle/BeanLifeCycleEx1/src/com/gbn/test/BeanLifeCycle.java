package com.gbn.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Hey..! its time to cleanup !!");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean has been initiated..!");
	}
	
	@Override
	public String toString() {
		return name;
	}

}
