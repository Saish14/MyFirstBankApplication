package com.bv.serviceimpl;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import com.bv.database.BankDatabase;
import com.bv.model.Account;
import com.bv.model.SavingAccount;

public class SavingAccountData {

private Map<Integer, SavingAccount> savingAccounts = BankDatabase.getSavingAccount();
	
	public SavingAccountData() {
		savingAccounts.put(101, new SavingAccount(101, "Parvati", 5000, true));
		savingAccounts.put(102, new SavingAccount(102, "Jaya", 7000, false));
	}
	// select all statement in sql
	//select * from accounts
	public ArrayList<SavingAccount> getAllAccounts()
	{
		return new ArrayList<SavingAccount>(savingAccounts.values());
	}
	//select * from accounts where acc_no = ?
	public SavingAccount getAccount(int acc_no)
	{
		return savingAccounts.get(acc_no);
	}
	public SavingAccount addAccount(SavingAccount savingAccount) {
		savingAccount.setAcc_no(savingAccount.getAcc_no()+0);
		savingAccounts.put(savingAccount.getAcc_no(),savingAccount);
		return savingAccount;
	}
	
	public Account updateAccount(SavingAccount savingAccount)
	{
		if(savingAccount.getHolder_name().isEmpty())
		{
			return null;
		}
		savingAccounts.put(savingAccount.getAcc_no(), savingAccount);
		return savingAccount;
			
	}
	public Account removeAccount(int acc_no)
	{
		return savingAccounts.remove(acc_no);
	}
}
