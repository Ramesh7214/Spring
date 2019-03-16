package com.gbn.service;

import org.springframework.stereotype.Component;

public interface TransactionService {
	
	public void withdraw(int amount);
	public int getBalance();

}
