package com.classofjava.java1702.test;

import com.classofjava.java1702.enums.Month;
import com.classofjava.java1702.enums.Season;
import com.classofjava.java1702.enums.ArithmeticOpertor;

public class TestEnum {
	public static void main(String[] args){
		System.out.println(Season.getSeason(Month.DEC).toString());
		
		System.out.println("5+5=" + ArithmeticOpertor.ADD.compute(5,5));
		System.out.println("5-5=" + ArithmeticOpertor.SUB.compute(5,5));
		System.out.println("5*5=" + ArithmeticOpertor.MUL.compute(5,5));
		System.out.println("5/5=" + ArithmeticOpertor.DIV.compute(5,5));
		System.out.println("5%5=" + ArithmeticOpertor.MOD.compute(5,5));
	}
}
