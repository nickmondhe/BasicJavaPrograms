package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class SqrtNewtonMethod {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the number you want to find the square root :");
		double c=utility.inputDouble();
		
		double epsilon = 1e-15;
		double t=c;
		
		while(Math.abs(t-c/t)>epsilon * t) {
			t=(c/t + t) /2.0;
		}	
		System.out.println(t);
	}
}
