package com.bv.model;

public class CurrentAccount extends Account {

	private double creditLimit;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int acc_no, String holder_name, double balance , double creditLimit) {
		super(acc_no, holder_name, balance);
		this.creditLimit = creditLimit;	
		this.setAccType("Current");
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
}
