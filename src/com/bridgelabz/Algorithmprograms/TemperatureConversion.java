package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		Utility utility=new Utility();
		double fahrenheit;
		double Celsius;
		System.out.println("Enter your choice");
		System.out.println("1.Convert the Temperature in Fahrenheit to Celsius\n"
						 + "2.Convert the Temperature in Celsius to Fajrenheit");
		int input=utility.inputInteger();
		switch(input)
		{
		case 1:
			System.out.println("Enter the temperature in Fahrenheit:");
			fahrenheit=utility.inputDouble();
			utility.temperatureinCelsius(fahrenheit);
			break;
		case 2:
			System.out.println("Enter the  temperature in Celsius:");
			Celsius=utility.inputDouble();
			utility.temperatureinFahrenheit(Celsius);
			break;
			
		default:
			System.out.println("Invaild input");
		}
	}
}
