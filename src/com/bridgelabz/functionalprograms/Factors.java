package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Factors {
		public static void main(String arg[]) {
			Utility utility=new Utility();
			
			// Initializing variables
			System.out.println("Please Enter the Number");
			Integer number=utility.inputInteger();
			
			System.out.println("The Prime Factors are :");
			Integer output=utility.primefactor(number);
			System.out.println(output);
	}
}
