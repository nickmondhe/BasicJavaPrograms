package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		Utility utility=new Utility();
		double Fahrenheit;
		double Celsius;
		System.out.println("Enter the temperature in Fahrenheit:");
		Fahrenheit=utility.inputDouble();
		utility.temperatureinCelsius(Fahrenheit);
		
		System.out.println("Enter the  temperature in Celsius:");
		Celsius=utility.inputDouble();
		utility.temperatureinFahrenheit(Celsius);
	}
}
