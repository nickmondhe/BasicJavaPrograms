package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the number you want to convert decimal to binary ");
		int decimal = utility.inputInteger();
		String binary= Utility.decimalToBinary(decimal);
		System.out.println("The binary value of " + decimal + " is :"+binary);
	}
}
