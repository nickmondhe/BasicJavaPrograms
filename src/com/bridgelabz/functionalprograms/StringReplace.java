package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StringReplace {

	public static void main(String[] args) {

		// Initializing variables
		Utility utility = new Utility();
		String template = "Hello <<UserName>>, How are you?";

		System.out.print("Please enter your name: ");
		String userName = utility.inputString();
		
		// Method declaration for replacing String
		String outputString = utility.replaceString(userName, template);
		System.out.println(outputString);

	}

}
