package com.classofjava.java1702.bank;

public class SavingAccount extends Account{
	
	public SavingAccount(String fullName, long openingBalance){
		super(fullName, openingBalance);
	}
	
	public SavingAccount(long accountNumber, String fullName, long openingBalance){
		super(accountNumber, fullName, openingBalance);
	}
}