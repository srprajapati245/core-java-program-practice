package com.classofjava.java1702.enums;

public enum ArithmeticOpertor {
	
	ADD(){
		public double compute(double value1, double value2) {
			return (value1 + value2);
		}
	},
	SUB(){
		public double compute(double value1, double value2) {
			return (value1 - value2);
		}
	},
	MUL(){
		public double compute(double value1, double value2) {
			return (value1 * value2);
		}
	},
	DIV(){
		public double compute(double value1, double value2) {
			return (value1 / value2);
		}
	},
	MOD(){
		public double compute(double value1, double value2) {
			return (value1 % value2);
		}
	}
	;
	
	public abstract double compute(double value1, double value2);
}