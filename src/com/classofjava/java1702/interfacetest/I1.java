package com.classofjava.java1702.interfacetest;

abstract public interface I1 {
	default void msg(){
		System.out.println("Message from interface I1");
	}
}