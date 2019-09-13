package com.bv.service;

import mypack.InsufficientBal;

public interface ITransaction {

	public void withdraw(double amount) throws InsufficientBal;
	public void deposite(double amount);
	
}
