package com.oracle.oca;

public class temperature {
	public static void main(String[] args) {
		double fahrenheit = 62.5D;
		/* Convert */
		double celsius = f2c((float) fahrenheit);
		System.out.println(fahrenheit + "F" + " = " + celsius + "C");
	}
	
	static double f2c(float fahr) {
		return ((fahr - 32.0) * 5.0 / 9.0);
	}
}