package com.oracle.oca;

public class Light { 
	
	// Static variable
	static int counter;
	
	// Instance variable
	int noOfWatts = 100;
	boolean indicator;
	String location;
	
	public static void main(String[] args) {
		Light bulb = new Light();
		System.out.println("Static variable counter: "+bulb.counter);
		System.out.println("Instance variable noOfWatts: "+bulb.noOfWatts);
		System.out.println("Instance variable indicator: "+bulb.indicator);
		System.out.println("Instance variable location: "+bulb.location);		
	}
}