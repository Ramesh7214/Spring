package com.gbn.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

	/*@Before("doWithDraw()") // for all the withdraw methods irrespective of class
	public void authenticate() {
		System.out.println("Authenticated!!");
	}

	@Before("doCheckBalance()")
	public void checkBalance() {
		System.out.println("You have sufficient balance");
	}*/
	
	@Before("doWithDraw() & doCheckBalance()")
	public void combinedPointCut()
	{
		System.out.println("Here point cut combined");
	}
	
	
	@Pointcut("execution( * withdraw(*))")
	public void doWithDraw(){}
	
	@Pointcut("execution(* getBalance())")
	public void doCheckBalance(){}
	
	

}
