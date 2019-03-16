package com.gbn.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAdvice{

	@Before("requestBalance()") // same as @Before("execution(public void getBalance())")
	public void withdraw1()
	{
		System.out.println("About to show balance!!");
	}
	
	@AfterReturning("requestBalance()") // same as @AfterReturning("execution(public void getBalance())") 
	public void withdraw2()
	{
		System.out.println("end of statement!!");
	}
	
	@Pointcut("@annotation(com.gbn.annotation.TransactionPointCut)")
	public void requestBalance(){}
	
}
