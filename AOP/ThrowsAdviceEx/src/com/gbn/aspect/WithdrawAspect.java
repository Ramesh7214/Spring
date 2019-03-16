package com.gbn.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class WithdrawAspect implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Authenticated succesfully .. !");
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("After Advice");
	}

	public void afterThrowing(Exception e) {
		System.out.println("Something went wrong..!");
	}
}
