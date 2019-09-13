package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.service.ITransaction;

import mypack.InsufficientBal;

public class CurrentAccountService implements ITransaction {

	double originalCreditLimit;
	
	public CurrentAccountService(CurrentAccount currentaccount) {
		super();
		this.currentaccount = currentaccount;
	}

	public CurrentAccountService(Account account) {
		// TODO Auto-generated constructor stub
	}

	CurrentAccount currentaccount;
	@Override
	public void withdraw(double amount) throws InsufficientBal {
		double balance=currentaccount.getBalance()-amount;
		double creditLimit=currentaccount.getCreditLimit();
		if (balance >= 0)
		{
			currentaccount.setBalance(balance);
			System.out.println("Your account has been debited with Rs." + amount);
			System.out.println("and Your account balance is Rs. " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		}
		else if (balance+creditLimit >= 0)
		{
			currentaccount.setBalance(balance);
			currentaccount.setCreditLimit(creditLimit+balance);
			System.out.println("Your account has been debited with Rs." + amount);
			System.out.println("and Your account balance is Rs. " + currentaccount.getBalance()+"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		}
		else
		{
			System.out.println("Invalid transaction you exceed credit limit");
			double temp = currentaccount.getBalance() + currentaccount.getCreditLimit();
			System.out.println("You can withdrawn Rs. "+temp+" only");
		}
			
		
			
	}

	@Override
	public void deposite(double amount) {
		
		if (currentaccount.getBalance() < 0)
		{
			double bal=currentaccount.getCreditLimit()+amount-originalCreditLimit;
			currentaccount.setCreditLimit(originalCreditLimit);
			currentaccount.setBalance(bal);
			System.out.println("Your account has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
		}
		else
		{
			currentaccount.setBalance(amount);
			System.out.println("Your account has been credited with Rs." + amount);
			System.out.println("and Your account balance is " + currentaccount.getBalance() +"\n"+"And your credit limit is "+currentaccount.getCreditLimit());
			
		}
		
		
	}
	
	
	public void chooseOperation() {
		Scanner sc = null;
		int choice;
		boolean flag = true;
		while (flag) {

			System.out.println("\n" + "Select one of the options below");
			System.out.println("1. Withdraw" + "\n" + "2. Deposite" + "\n" + "3. Display Details" + "\n" + "4. Exit"+"\n");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter amount to be withdraw"+"\n");
				try {
					withdraw(sc.nextDouble());
				} catch (InsufficientBal e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}

			case 2: {
				System.out.println("Enter amount to be deposite"+"\n");
				deposite(sc.nextDouble());
				break;
			}
			case 3: {
				System.out.println(currentaccount);
				break;
			}
			case 4: {
				System.out.println("Transaction complete\n");
				flag = false;
				break;
			}
			default: {
				System.out.println("Enter Valid operation"+"\n");
				break;
			}
			}

		}
	}
}

