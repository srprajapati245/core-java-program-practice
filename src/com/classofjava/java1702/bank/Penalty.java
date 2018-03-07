package com.classofjava.java1702.bank;

public interface Penalty{
	long compute(long balance, long minBalance);
	Penalty ZERO = (balance, minBalance) -> 0;
	static Penalty fixed(long amount){
		return (balance, minBalance) -> balance < minBalance ? amount : 0;
	}
	static Penalty percent(double per){
		return (balance, minBalance) -> balance < minBalance ? (long)((minBalance-balance)*per) : 0;
	}	
}