package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Utility utility =new Utility();
		System.out.println("Enter the Number :");
		Integer number = utility.inputInteger();

		System.out.println("The Harmonic number is :");
		Integer output = utility.findHarmonicNumber(number);
		System.out.println(output);
	}

}
