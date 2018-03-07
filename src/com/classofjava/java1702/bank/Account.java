package com.classofjava.java1702.bank;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.time.Instant;
import java.util.Date;

abstract public class Account {
	
	private long accountNumber;
	private String fullName;
	private long balance;
	private static long lastAccountNumber = 1000;
	private List<Transaction> passbook = new ArrayList<>();
	private int nextPassbookEntryIndex = 0;
	
	
	public Account(String fullName, long openingBalance){
		this(++lastAccountNumber, fullName, openingBalance);
	}
	
	public Account(long accountNumber, String fullName, long openingBalance){
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		new Transaction("Opening Account", TransactionType.CREDIT, openingBalance);
	}
	
	class Transaction{
		private long dateOfTransaction = System.currentTimeMillis();
		private String narration;
		private TransactionType type;
		private long amount;
		private long currentBalance;
		
		Transaction(String narration, TransactionType type, long amount){
			this. narration = narration;
			this.type = type;
			this.amount = amount;
			/*if(nextPassbookEntryIndex == passbook.length){
				passbook = Arrays.copyOf(passbook, (nextPassbookEntryIndex+100));
			}*/
			balance += getNetAmount();	
			this.currentBalance = balance;
			// passbook[nextPassbookEntryIndex++] = this;			
			passbook.add(this);
		}

		public long getDate(){
			return this.dateOfTransaction;
		}
		
		public String getNarration(){
			return this.narration;
		}
		
		public TransactionType getType(){
			return this.type;
		}
		
		public long getAmount(){
			return this.amount;
		}
		
		public long getCurrentBalance(){
			return this.currentBalance;
		}
		
		public long getNetAmount(){
			if(type == TransactionType.CREDIT) {
				return this.getAmount();
			}else {
				return (-this.getAmount());
			}
		}
		
		@Override
		public String toString() {
			return "Date of Transaction: " + Date.from(Instant.ofEpochMilli(this.getDate())).toString() + 
				    ", Narration: " + this.getNarration() + 
				    ", " + this.getType().name() + 
				    ": " +this.getAmount()+ 
				    ", Balance: " + this.getCurrentBalance();
		}
	}
	
	enum TransactionType {
		CREDIT,
		DEBIT,
		;
	}
	
	public void diposit(String narration, long amount) throws NagativeAmountException{
		if(amount < 0){
			throw new NagativeAmountException("Nagative Amount", amount);
		}else{
			new Transaction(narration, TransactionType.CREDIT, amount);
		}		
	}
	
	public boolean withdraw(String narration, long amount) throws NagativeAmountException{
		if(amount < 0){
			throw new NagativeAmountException("Nagative Amount", amount);
		}
		if(this.balance < amount){
			return false;
		} else {
			new Transaction(narration, TransactionType.DEBIT, amount);
			return true;
		}
	}
	
	public long getAccountNumber(){
		return this.accountNumber;
	}
	
	public String getFullName(){
		return this.fullName;
	}
	
	public long getBalance(){
		return this.balance;
	}
	
	public void display(){
		System.out.println("Account: " + this.accountNumber + ", " + this.fullName + ", " + this.balance);
	}
	
	public void printPassbook(){
		System.out.println("*******Start Printing Passbook*******");
		passbook.forEach(System.out :: println);
		System.out.println("*******End Printing Passbook*******");
		/*for(Transaction transaction : passbook) {
			if(transaction == null){
				
			}else{
				System.out.println(transaction.toString());
			}			
		}*/
	}
}