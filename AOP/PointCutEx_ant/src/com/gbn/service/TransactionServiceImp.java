package com.gbn.service;

import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImp implements TransactionService {
	
	static int balance = 100000;

	@Override
	public void withdraw(int amount) {
		
		System.out.println("Withdrawn Amount : "+ amount+ ", Available balance :"+(balance-amount) );
		balance = balance - amount;

	}

	@Override
	public int getBalance() {
		
		return balance;
	}

}
