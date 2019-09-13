package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.Account;
import com.bv.model.SavingAccount;

public class AccountService {

	SavingAccountData savingAccountData;
	CurrentAccountData currentAccountData;
	SavingAccountService savingAccountService;
	CurrentAccountService currentAccountService;
	Account account;

	public AccountService() {
		
		savingAccountData=new SavingAccountData();
		currentAccountData=new CurrentAccountData();
		
			
	}
	
	static
	{
		System.out.println("                                                    ");
		System.out.println("**************BANK OF UNITED KINGDOM***************");
		System.out.println("                                                    ");
	}

	public void chooseAccount() {
		Scanner sc = null;
		int choice;
		boolean flag = true;
		while (flag) {
			
			System.out.println("\n" + "Select one of the options below");
			System.out.println("1. Saving" + "\n" + "2. Current" + "\n");
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				
				System.out.println("Enter the Account Number : ");
				savingAccountService = new SavingAccountService(savingAccountData.getAccount(sc.nextInt()));
				savingAccountService.chooseOperation();
				flag = false;
				break;
			}

			case 2: {
				System.out.println("Enter the Account Number : ");
				currentAccountService = new CurrentAccountService(currentAccountData.getAccount(sc.nextInt()));
				currentAccountService.chooseOperation();
				flag = false;
				break;
			}
			default: {
				System.out.println("Enter Valid Account"+"\n");
				break;
			}
			}
		}
	}
	
	
}
