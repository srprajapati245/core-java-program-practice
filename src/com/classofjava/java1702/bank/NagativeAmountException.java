package com.classofjava.java1702.bank;

public class NagativeAmountException extends Exception{
	
	private String message;
	private long amount;
	
	public NagativeAmountException(String message, long amount){
		super(message);
		this.amount = amount;
	}
	
}