package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.Account;
import com.bv.model.SavingAccount;
import com.bv.service.ITransaction;

import mypack.InsufficientBal;

public class SavingAccountService implements ITransaction {

	SavingAccount savingAccount;

		public SavingAccountService(SavingAccount savingAccount) {
		super();
		this.savingAccount = savingAccount;
		
		if(!savingAccount.isSalaryAccount())
		{
			savingAccount.setAcc_type("Saving");
			set();
		}
		else
		{
			savingAccount.setAcc_type("Salary");
		}
	}
		
		public SavingAccountService(Account account) {
			// TODO Auto-generated constructor stub
		}
		
		public static void setAccountType(SavingAccount savingAccount)
		{
			if (!((SavingAccount) savingAccount).isSalaryAccount()) {
				savingAccount.setAcc_type("Saving");
			} else {
				savingAccount.setAcc_type("Salary");
			}
		}

		private void set() 
		{
			savingAccount.setLimit_charges(100);
			savingAccount.setMin_balance(1000);
		}

	@Override
	public void withdraw(double amount) {

		//System.out.println("Before withdraw:" + savingAccount.getBalance());
		if (amount < 0) {
			System.out.println("Amount cannot be negative");
		} else if (savingAccount.getBalance() < amount) {
			try {
				throw new InsufficientBal("Insufficient Balance ");
			} catch (InsufficientBal e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			savingAccount.setBalance(savingAccount.getBalance() - amount);
			System.out.println(amount + "" + "Amount deducted");
		if(savingAccount.getBalance() - savingAccount.getLimit_charges() > 0 &&  savingAccount.isSalaryAccount()==false)
		{
			if (savingAccount.getBalance() < savingAccount.getMin_balance() && savingAccount.getBalance() < 1000) {
				savingAccount.setBalance(savingAccount.getBalance() - savingAccount.getLimit_charges());
				System.out.println("Chargers applied for not maintining min balance: " + savingAccount.getLimit_charges());
			}
		}
		else if (savingAccount.isSalaryAccount() == false)
		{
			System.out.println("Limit charges of "+savingAccount.getLimit_charges()+" rs will be debited in next transaction");
			    savingAccount.setBalance(savingAccount.getBalance() - savingAccount.getLimit_charges());
			   
		}  
            if (savingAccount.getBalance() < 0)
            	System.out.println("Total_balance:" + 0.0);
            else
            	System.out.println("Total_balance:" + savingAccount.getBalance());
            
		}
	  }

	@Override
	public void deposite(double amount) {

		//System.out.println("Before Depoite: " + savingAccount.getBalance());
		savingAccount.setBalance(savingAccount.getBalance() + amount);
		System.out.println(amount + " Rs. Amount credited");
		System.out.println("Total balance after deposite " + savingAccount.getBalance());
	}
	
	
	public void chooseOperation() {
		Scanner sc = null;
		int choice;
		boolean flag = true;
			while (flag) {

				System.out.println("\n" + "Select one of the options below");
				System.out.println("1. Withdraw" + "\n" + "2. Deposit" + "\n" + "3. Display Details" + "\n" + "4. Exit");
				sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter amount to be withdraw\n");
					withdraw(sc.nextDouble());
					break;
				}

				case 2: {
					System.out.println("Enter amount to be deposite\n");
					deposite(sc.nextDouble());
					break;
				}
				case 3:
					System.out.println("Holder name: "+savingAccount.getHolder_name());
					System.out.println("Account number: "+savingAccount.getAcc_no());
					System.out.println("Account Type name: "+savingAccount.getAcc_type());
					System.out.println("Account Balance: "+savingAccount.getBalance());
					break;

				case 4: {
					System.out.println("Transaction complete\n");
					flag = false;
					 break;
				}
				default: {
					System.out.println("Enter Valid operation\n");
					break;
				}
				}

			}
	
	}

}
