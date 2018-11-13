package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class DayofWeek {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the day :");
		int day=utility.inputInteger();
		System.out.println("Enter the month :");
		int month=utility.inputInteger();
		System.out.println("Enter the year :");
		int year=utility.inputInteger();
		
		String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int result=utility.dayofWeek(month,day,year);
		System.out.println("The day  of week is :"+week[result]);
	}
}
