package com.classofjava.java1702.bank;

public class NoSuchAccountException extends Exception{
	
	private String message;
	
	public NoSuchAccountException(String message){
		super(message);
	}
	
}