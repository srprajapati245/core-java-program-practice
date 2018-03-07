package com.classofjava.java1702.interfacetest;

public class Ambiguous extends Abstract1 implements I1,I2 {
	
	public void msg(){
		I1.super.msg();
		I2.super.msg();
		System.out.println("Message from abstract class Ambiguous");
	}
	
	public void msg2(){
		System.out.println("Message from abstract class Ambiguous");
	}
}