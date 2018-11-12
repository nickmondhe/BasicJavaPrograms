package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args)
	{	
		Utility utility = new Utility();
		
		// Initializing variables
		System.out.println("Enter a leap year:");
		int year=utility.inputInteger();
		boolean result =Utility.leapYearCheaker(year);
	 
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

