package com.bv.model;

import com.bv.serviceimpl.SavingAccountService;

public class SavingAccount extends Account {

	private double limit_charges;
	private double min_balance;
	private boolean isSalaryAccount; 
	private String Acc_type;

	public String getAcc_type() {
		return Acc_type;
	}

	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getLimit_charges() {
		return limit_charges;
	}

	public void setLimit_charges(double limit_charges) {
		this.limit_charges = limit_charges;
	}

	public double getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}

	public SavingAccount(int acc_no, String holder_name, double balance, boolean isSalaryAccount) {
		super(acc_no, holder_name, balance);
		this.isSalaryAccount = isSalaryAccount;
		SavingAccountService.setAccountType(this);
		
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
}
