package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * This method takes an input Double from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The double which is passed as input to the scanner
	 */
	public double inputDouble() {
		return scanner.nextDouble();
	}
	
	/**
	 * This method takes an input String from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The string which is passed as input to the scanner
	 */
	public String inputString() {
		return scanner.next();
	}
	
	
	/**
	 * This method takes an input Integer from the user and passes it 
	 * on to the method where it is called
	 * 
	 * @return The integer which is passed as input to the scanner
	 */
	public Integer inputInteger() {
		return scanner.nextInt();
	}
	

	/**
	 * This method is used to replace the string template with the 
	 * provided input given by the user.
	 * 
	 * @param userName input given by the user
	 * @param template string which needs to be modified
	 * @return output the out string given back to the user
	 */
	public String replaceString(String userName, String template) {
		if (userName.length() <= 3)
			return "Please input string with more than 3 characters";
		else {
			String output = template.replace("<<UserName>>", userName);
			return output;
		}
	}

	
	/**
	 * This is method is used to find the Harmonic number input 
	 * given by the user.
	 * 
	 * @param number integer is provided by the user 
	 * @return
	 */
	public Integer findHarmonicNumber(Integer number) {
		double result=1;
		while(number>0)
		{
			result=result+(double)1/number;
			number--;
			System.out.println(""+result);
		}
		return 0;
	}


	/**
	 * This method is used to find the prime factor with the input 
	 * provided by the user.
	 * 
	 * @param number Integer take user input 
	 * @return
	 */
	public Integer primefactor(Integer number) {
		while(number%2==0)
		{
			System.out.println("2");
			number/=2;
		}
		for (int i=3;i<Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number/=i;
			}
		}
		if(number>2)
		{
			System.out.println(number);
		}
		return null;
	}

	/**
	 * This method is used to calculate  the Windchill which is taken 
	 * form the user.
	 * 
	 * @param temperature double this taken as a input
	 * @param windspeed double this taken by the user
	 * @return output given by to user as a output
	 */
	public double findwindchill(double temperature, double windspeed) {
		
		double output = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);
		
		return output;
	}
	
}
