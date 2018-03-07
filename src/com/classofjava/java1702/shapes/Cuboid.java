package com.classofjava.java1702.shapes;

import com.classofjava.java1702.shapes.Rectangle;

public class Cuboid{
	
	private Rectangle rectangle;
	private int height;
	
	public Cuboid(int side){
		this.rectangle = new Rectangle(side);
		this.height = side;
	}
	
	public Cuboid(int length, int width, int height){
		this.rectangle = new Rectangle(length, width);
		this.height = height;
	}
	
	public int volume(){
		return this.rectangle.area() * this.height;
	}
	
	public int area(){
		return this.rectangle.getLength() * this.height;
	}

	public int getLength(){
		return this.rectangle.getLength();
	}
}