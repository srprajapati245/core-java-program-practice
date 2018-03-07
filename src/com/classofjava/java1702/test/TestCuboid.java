package com.classofjava.java1702.test;

import com.classofjava.java1702.shapes.Rectangle;
import com.classofjava.java1702.shapes.inheritance.Cuboid;

public class TestCuboid {
	public static void main(String[] args){
		Rectangle r1, r2;
		Cuboid c1, c2;
		
		r1 = new Rectangle(7,5);
		r2 = new Cuboid(7,5,4);
		//c1 = new Rectangle(7,5);
		c2 = new Cuboid(7,5,4);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(c2.area());
		System.out.println(c2.volume());
		System.out.println(((Cuboid)r2).volume());
		
		System.out.println(r1.getLength());
		System.out.println(r2.getLength());
		System.out.println(((Cuboid)r2).getLength());
		System.out.println(c2.getLength());
	
		System.out.println(r1 instanceof Rectangle); // true
		System.out.println(r1 instanceof Cuboid);    // false
		System.out.println(r2 instanceof Rectangle); // true
		System.out.println(r2 instanceof Cuboid);    // true
		System.out.println(c2 instanceof Rectangle); // true
		System.out.println(c2 instanceof Cuboid);    // true
		
	}
}