package com.classofjava.java1702.shapes.inheritance;

import com.classofjava.java1702.shapes.Rectangle;

public class Cuboid extends Rectangle{
	
	private int height;
	private int length; // variable shadowing
	
	public Cuboid(int side){
		this(side,side,side);
	}
	
	public Cuboid(int length, int width, int height){
		super(length, width);
		this.height = height;
	}
	
	public int volume(){
		return super.area() * this.height;
	}
	
	public int area(){ //method overriding
		return this.length * this.height;
	}
	
}