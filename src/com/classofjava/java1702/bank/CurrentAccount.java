package com.classofjava.java1702.bank;

public class CurrentAccount extends Account{
	
	private static final long MIN_BALANCE = 10_000;
	//private static final long PENALTY = 100;
	private Penalty penalty = Penalty.fixed(100);
	
	public CurrentAccount(String fullName, long openingBalance){
		super(fullName, openingBalance);
	}
	
	public CurrentAccount(long accountNumber, String fullName, long openingBalance){
		super(accountNumber, fullName, openingBalance);
	}
	
	public void setPenalty(Penalty p){
		this.penalty = p;
	}
	
	public boolean withdraw(String narration, long amount) throws NagativeAmountException{
		if(!super.withdraw(narration, amount)){
			return false;
		} else {
			if(this.getBalance() < MIN_BALANCE){
				new Transaction("Penalty", TransactionType.DEBIT, penalty.compute(this.getBalance(), MIN_BALANCE));
			}
			return true;
		}
	}
	
}