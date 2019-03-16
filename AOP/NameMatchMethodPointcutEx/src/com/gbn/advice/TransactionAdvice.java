package com.gbn.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TransactionAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation object) throws Throwable {
		
		System.out.println("Authenticated ..!!");
		Object obj = object.proceed();
		System.out.println("Request Processed Succesfully!!");
		
		return null;
	}
}
