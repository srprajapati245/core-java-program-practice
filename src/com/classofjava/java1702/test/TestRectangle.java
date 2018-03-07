package com.classofjava.java1702.test;

import com.classofjava.java1702.shapes.Rectangle;

public class TestRectangle{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(10,5);
		Rectangle r2 = new Rectangle(15);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(Rectangle.getCount());
	}
}