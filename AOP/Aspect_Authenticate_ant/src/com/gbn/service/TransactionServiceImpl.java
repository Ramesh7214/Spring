package com.gbn.service;

import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService {

	@Override
	public void withdraw() {
		
		System.out.println("Withdrawn succeffully !!");
		
	}

}
