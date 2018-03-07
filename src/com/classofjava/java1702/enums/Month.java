package com.classofjava.java1702.enums;

public enum Month {
	JAN("January"),
	FEB("February", 29),
	MAR("March"),
	APR("April",30),
	MAY("May"),
	JUN("June",30),
	JUL("July"),
	AUG("August"),
	SEP("September",30),
	OCT("October"),
	NOV("November",30),
	DEC("December"),
	;
	
	private String name;
	private int maxDays;
		
	Month(String name, int maxDays){
		this.name = name;
		this.maxDays = maxDays;
	}
	
	Month(String name){
		this(name, 31);
	}
	
	public int getMaxDays(){
		return this.maxDays;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	public boolean isBetween(Month fromMonth, Month endMonth){
		if(this.compareTo(fromMonth) == 0)
			return true;
		if(this.compareTo(endMonth) == 0)
			return true;
		if(this.compareTo(fromMonth) > 0 && this.compareTo(endMonth) < 0)
			return true;
		else
			return false;
	}
}