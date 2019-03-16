package com.gbn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gbn.service.TransactionService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TransactionService transactionService = (TransactionService) context.getBean("transactionProxy");
		transactionService.withdraw();
	}
}