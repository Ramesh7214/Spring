package com.gbn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WithdrawAspect {
	
	@Before("execution(public void withdraw())")
	public void Authenticate()
	{
		System.out.println("Authenticated succesfully !!");
	}

}
