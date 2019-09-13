package com.bv.execution;

import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SalaryAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.AccountService;
import com.bv.serviceimpl.CurrentAccountData;
import com.bv.serviceimpl.CurrentAccountService;
import com.bv.serviceimpl.SalaryAccountService;
import com.bv.serviceimpl.SavingAccountData;
import com.bv.serviceimpl.SavingAccountService;

import mypack.InsufficientBal;

public class BankApp {

	public static void main(String[] args) {
		//Account salAccount = new SalaryAccount(102, "SalaryAccountHolder", 4000, true);
//		Account savingAccount1 = new SavingAccount(101, "Parvati", 5000, true);
//		SavingAccountService savingAccountService = new SavingAccountService((SavingAccount)savingAccount1);
//		savingAccountService.chooseOperation();
//		
//		
//		Account savingAccount2 = new SavingAccount(102, "Dhawal", 4000, false);
//		SavingAccountService savingAccountService1 = new SavingAccountService((SavingAccount)savingAccount2);
//		savingAccountService1.chooseOperation();
//		
		
//	     Account currentaccount = new CurrentAccount(103 , "Ram" , 3000 , 10000);
//	     CurrentAccountService currentAccountService = new CurrentAccountService((CurrentAccount) currentaccount);
//	     try {
//			currentAccountService.withdraw(11000);
//		} catch (InsufficientBal e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	     
//	     currentAccountService.deposite(5000);
//	     
	     
//		System.out.println("Acco no: "+savingAccount1.getAcc_no());
//		System.out.println("Holder name: "+savingAccount1.getHolder_name());
//		System.out.println("Balance: "+savingAccount1.getBalance());
//		System.out.println("Limit charges: "+((SavingAccount) savingAccount1).getLimit_charges());
//		System.out.println("Minimm balance to be maintained: "+((SavingAccount) savingAccount1).getMin_balance());
//		
//		SavingAccountService savingAccountService = new SavingAccountService((SavingAccount)savingAccount1);
//		savingAccountService.deposite(500);
//		savingAccountService.withdraw(4600);
//		//savingAccountService.deposite(1000);
//		savingAccountService.withdraw(350);
//		savingAccountService.withdraw(350);
//		savingAccountService.deposite(1050);
//		savingAccountService.withdraw(1150);
//		
	
		
		
//		System.out.println("-------------------------------");
		
//		System.out.println("Acco no: "+salAccount.getAcc_no());
//		System.out.println("Holder name: "+salAccount.getHolder_name());
//		System.out.println("Balance: "+salAccount.getBalance());
//		System.out.println("Credit card Issued: "+((SalaryAccount) salAccount).isCreditCardIssued());
//		
//		SalaryAccountService salaryAccountService = new SalaryAccountService((SalaryAccount) salAccount);
//		salaryAccountService.withdraw(1000);
//		salaryAccountService.deposite(100);
	     
//	     SavingAccountData savingRepo = new SavingAccountData();
//			System.out.println(savingRepo.getAllAccounts());
//			System.out.println(savingRepo.getAccount(101));
//			SavingAccount savingAccount = new SavingAccount(103, "Kajal", 10000, true);
//			System.out.println(savingRepo.addAccount(savingAccount));
//			System.out.println(savingRepo.getAllAccounts());
//			System.out.println(savingRepo.removeAccount(102));
//			System.out.println("After Deletion");
//			System.out.println(savingRepo.getAllAccounts());
//			
//			System.out.println("******************************************");
//			
//			
//	        
//		    CurrentAccountData currentAccountData = new CurrentAccountData();
//			System.out.println(currentAccountData.getAllAccounts());
//		
			
			AccountService accountservice = new AccountService();
			accountservice.chooseAccount();
		
		
		
		
	}

}
