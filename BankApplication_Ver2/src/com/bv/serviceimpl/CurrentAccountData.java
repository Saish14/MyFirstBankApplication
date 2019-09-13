package com.bv.serviceimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.database.BankDatabase;
import com.bv.model.Account;
import com.bv.model.CurrentAccount;

public class CurrentAccountData {
	
private Map<Integer, CurrentAccount> currentAccounts = BankDatabase.getCurrentAccount();
	
	public CurrentAccountData() {
		currentAccounts.put(101, new CurrentAccount(201, "Brook", 5000 , 10000));
		currentAccounts.put(102, new CurrentAccount(202, "Jerry", 7000 , 20000));
	}
	// select all statement in sql
	//select * from accounts
	public List<CurrentAccount> getAllAccounts()
	{
		return new ArrayList<CurrentAccount>(currentAccounts.values());
	}
	//select * from accounts where acc_no = ?
	public CurrentAccount getAccount(int acc_no)
	{
		return currentAccounts.get(acc_no);
	}
	public CurrentAccount addAccount(CurrentAccount currentAccount) {
		currentAccount.setAcc_no(currentAccount.getAcc_no()+0);
		currentAccounts.put(currentAccount.getAcc_no(),currentAccount);
		return currentAccount;
	}
	
	public Account updateAccount(CurrentAccount currentAccount)
	{
		if(currentAccount.getHolder_name().isEmpty())
		{
			return null;
		}
		currentAccounts.put(currentAccount.getAcc_no(), currentAccount);
		return currentAccount;
			
	}
	public Account removeAccount(int acc_no)
	{
		return currentAccounts.remove(acc_no);
	}
	

}
