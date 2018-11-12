package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class PowerofTwo {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter a number:");
        int num=utility.inputInteger();
        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all till Power Value "+num);
        
        for(int i=1;i<=num;i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
        }
	}
}
