package com.classofjava.java1702.enums;

import com.classofjava.java1702.enums.Month;

public enum Season {
	WINTER(Month.NOV, Month.FEB){
		public String toString(){
			return "Winter";
		}
	},
	SUMMER(Month.MAR, Month.MAY){
		public String toString(){
			return "Summer";
		}
	},
	MONSOON(Month.JUN, Month.OCT){
		public String toString(){
			return "Monsoon";
		}
	},
	;

	private Month startMonth, endMonth;
	
	Season(Month startMonth, Month endMonth){
		this.startMonth = startMonth;
		this.endMonth = endMonth;
	}
	
	public Month getStartMonth(){
		return this.startMonth;
	}
	
	public Month getEndMonth(){
		return this.endMonth;
	}
	
	public static Season getSeason(Month month){
		if(month.isBetween(Month.MAR, Month.MAY))
			return Season.SUMMER;
		if(month.isBetween(Month.JUN, Month.OCT))
			return Season.MONSOON;
		else
			return Season.WINTER;
		
	}
}