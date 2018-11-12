package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	
	public static void main(String arg[]) {
		Utility utility=new Utility();
		
		System.out.println("Enter the money you want to change");
		int money=utility.inputInteger();
		utility.giveMinimumChange(money);
	}
}