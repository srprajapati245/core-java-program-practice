package com.classofjava.java1702.bank;

import java.util.Map;
import java.util.HashMap;

public class Bank {
	
	private String bankName;
	private Map<Long, Account> accountMap = new HashMap<>();
	private long lastAccountNo;
	
	public Bank(String bankName, int bankCode){
		this.bankName = bankName;
		this.lastAccountNo = (long) bankCode * 1000;
	}
	
	public long openAccount(String name, AccountType type, long openingBalance) throws NagativeAmountException{
		if(openingBalance < 0)
			throw new NagativeAmountException("Nagative Ammount", openingBalance);
		
		if(type == AccountType.SAVING_ACCOUNT){
			accountMap.put(++lastAccountNo, new SavingAccount(lastAccountNo, name, openingBalance));
		} else {
			accountMap.put(++lastAccountNo, new CurrentAccount(lastAccountNo, name, openingBalance));
		}
		return lastAccountNo;
	}
	
	public void diposit(long accountNo, long amount) throws NagativeAmountException, NoSuchAccountException {
		getAccount(accountNo).diposit("diposit", amount);
	}
	
	public void withdraw(long accountNo, long amount) throws NagativeAmountException, NoSuchAccountException {
		if(amount < 0)
			throw new NagativeAmountException("Nagative Ammount", amount);
		
		getAccount(accountNo).withdraw("withdraw", amount);
	}
	
	public void printPassbook(long accountNo) throws NoSuchAccountException {
		getAccount(accountNo).printPassbook();
	}
	
	private Account getAccount(long accountNo) throws NoSuchAccountException {
		return this.accountMap.get(accountNo);
	}
	
	public void listAccount() {
		System.out.println("*******Start Printing Account List*******");
		this.accountMap.entrySet().forEach((entryMap) -> entryMap.getValue().display());
		//Map.Entry :: getValue);
		System.out.println("*******End Printing Account List*******");
	}
	
	public long closeAccount(long accountNo) throws NoSuchAccountException {
		return this.accountMap.remove(accountNo).getBalance();
	}
}