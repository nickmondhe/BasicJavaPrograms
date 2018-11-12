package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Please enter the Temperature should be less than 50 ");
		double temperature=utility.inputDouble();
		
		System.out.println("The Wind speed should be greater than 120 OR less than 3");
		double windspeed=utility.inputDouble();
		
		double output=utility.findwindchill(temperature,windspeed);
		System.out.println(output);
	}

}
