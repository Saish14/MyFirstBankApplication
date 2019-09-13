package com.bv.model;

public class Account {
	private int acc_no;
	private String holder_name;
	private double balance;
    private String accType;
    
	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Account() {
		
	}

	@Override
	public String toString() {
		return "Account Number =" + acc_no  + " \nholder_name=" + holder_name + " \nbalance=" + balance + " \n"+"AccountType = "+accType+"\n";
	}

	public Account(int acc_no, String holder_name, double balance) {
		super();
		this.acc_no = acc_no;
		this.holder_name = holder_name;
		this.balance = balance;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

}
