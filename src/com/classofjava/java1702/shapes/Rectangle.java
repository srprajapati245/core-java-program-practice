package com.classofjava.java1702.shapes;

public class Rectangle{
	private int length;
	private int width;
	private static int count;
	
	static{
		//class initializer
		//System.out.println("class initializer");
		count = 0;
	}
	
	{
		// initializer block
		//System.out.println("initializer block");
		count++;
	}
	
	public Rectangle(int side){
		this(side, side);
		//System.out.println("constructor having only side value");
	}
	
	public Rectangle(int length, int width){
		//System.out.println("constructor having length and width");
		this.setDimensions(length, width);
	}
	
	public void setDimensions(int length, int width){
		//System.out.println("setDimensions using length and width");
		this.length = length;
		this.width = width;
	}
	
	public void setDimensions(int side){
		//System.out.println("setDimensions using side");
		this.setDimensions(side, side);
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getWidth(){
		return this.width;
	}

	public int area(){
		//System.out.println("finding area");
		return this.length * this.width;
	}
	
	public static int getCount(){
		//System.out.println("getting count value");
		return count;
	}
	
	public void finalize(){
		//System.out.println("calling finalize mathod");
		count--;
	}
	
}