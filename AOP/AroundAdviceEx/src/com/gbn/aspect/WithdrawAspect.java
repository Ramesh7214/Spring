package com.gbn.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WithdrawAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation object) throws Throwable {
		
		System.out.println("Before Advice..!");
		Object obj = object.proceed();
		System.out.println("After Advice");
		
		
		return obj;
	}
}
