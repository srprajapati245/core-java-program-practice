package com.classofjava.java1702.abstracttest;

abstract public class Vehicle {
	
	int numberOfTier;
	int maxLoad;
	
	abstract public void setNumberOfTier(int numberOfTier);
	
	abstract public int getNumberOfTier();
	
	abstract public void setMaxLoad(int maxLoad);
	
	abstract public int getMaxLoad();
}