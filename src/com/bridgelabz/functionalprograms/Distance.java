package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Distance { 
	public static void main(String arg[]) {
		Utility utility=new Utility();
		System.out.println("Enter the value quadrant");
		int x1=utility.inputInteger();
		int x2=utility.inputInteger();
		int y1=utility.inputInteger();
		int y2=utility.inputInteger();
		double result=utility.finddistance(x1,y1,x2,y2);
		System.out.println("The Distance is :"+result);		
	}
}

