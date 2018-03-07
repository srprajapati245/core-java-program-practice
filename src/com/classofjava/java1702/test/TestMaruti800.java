package com.classofjava.java1702.test;

import com.classofjava.java1702.abstracttest.Vehicle;
import com.classofjava.java1702.abstracttest.Maruti800;

public class TestMaruti800 {
	public static void main(String[] args){;
		
		Vehicle vehicle = new Maruti800();
		vehicle.setNumberOfTier(4);
		vehicle.setMaxLoad(400);
		
		System.out.println("Number Tier: " +vehicle.getNumberOfTier());
		System.out.println("Number Tier: " +vehicle.getMaxLoad());
	}
}