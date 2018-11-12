package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	
		public static void main(String[] args) 
		{
			Utility utility=new Utility();
			System.out.println("Enter the loan amount :");
			double principal=utility.inputDouble();
			System.out.println("Enter the Number of years :");
			double numberOfYears=utility.inputDouble();
			System.out.println("Enter the Interest rate :");
			double rateOfIntrest=utility.inputDouble();
			double payment=utility.calmonthlyPayment(principal,numberOfYears,rateOfIntrest);
			System.out.println("Monthly payment of "+payment+" you would have to make over "+numberOfYears+
					" years to pay off a "+principal+" loan amount at "+rateOfIntrest+" percent intrest compounded monthly");
		}

	}
