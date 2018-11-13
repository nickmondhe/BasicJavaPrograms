package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Binary {
	
	public static void main(String arg[]) {
		
		Utility utility=new Utility();
		//Initializing variables
		System.out.println("Enter the number you want to convert decimal to binary ");
		int decimal = utility.inputInteger();
		
		String binary = Utility.decimalToBinary(decimal);//Method is used to convert decimal to binary
		System.out.println("The binary value of " + decimal + " is :"+binary);
		int result = Integer.parseInt(binary);//Convert String to Integer
		int nibbles = Utility.swapNibbles(result);
		System.out.println("Swap nibbles to find new number :"+nibbles);
		String binary1=Utility.decimalToBinary(nibbles);
		System.out.println("The binary value of " + nibbles + " is :"+binary1);
	}
}