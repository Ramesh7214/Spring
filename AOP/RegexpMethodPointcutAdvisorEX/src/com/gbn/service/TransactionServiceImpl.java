package com.gbn.service;

public class TransactionServiceImpl implements TransactionService {
	
	static int balance = 100000;

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawn : "+amount+", Available balance"+(balance-amount));
		balance=balance-amount;

	}

	@Override
	public void getBalance() {
		System.out.println("available balance : "+balance);
	}

}
