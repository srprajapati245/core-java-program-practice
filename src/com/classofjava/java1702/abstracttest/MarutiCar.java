package com.classofjava.java1702.abstracttest;

abstract public class MarutiCar extends Car {
	
	public int getNumberOfTier(){
		return this.numberOfTier;
	}
	
	public void setMaxLoad(int maxLoad){
		this.maxLoad = maxLoad;
	}
	
	public int getMaxLoad(){
		return this.maxLoad;
	}
}