package com.gbn.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WithdrawAspect implements MethodBeforeAdvice{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		if(arg1[0].equals("Ramesh")) {
		System.out.println("Authenticated succesfully .. !");
		} else {
			throw new RuntimeException("");
		}
		
	}
}
