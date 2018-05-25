package com.classofjava.java1702.shapes;

class TestEquality {
	public static void main(String[] args) {
		Rectangle r1, r2;
		r1 = new Rectangle(7,5);
		r2 = new Rectangle(7,5);
		
		if(r1==r2)
			System.out.println("r1==r2 is true");
		else
			System.out.println("r1==r2 is false");
		
		//(r1==r2) ? System.out.println("r1==r2 is true") : System.out.println("r1==r2 is false");
	}
}