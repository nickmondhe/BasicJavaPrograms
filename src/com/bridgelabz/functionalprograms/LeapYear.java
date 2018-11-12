package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	
	//Method for to check the leap year
	public static boolean leapYearCheaker(int year)
	{
		if(year>1000)
		{
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		   }
		}
		return false;
	}

	public static void main(String[] args)
	{	
		Utility utility = new Utility();
		// Initializing variables
		System.out.println("Enter a leap year:");
		int year=utility.inputInteger();
		boolean result = leapYearCheaker(year);
	 
		if(result)
		{
			System.out.println("Year:"+ year + " is a leap year");
		}
		else
		{
			System.out.println("Year:"+ year + " is not a leap year");
		}
	}
}

