package com.bridgelabz.functionalprograms;

import static java.lang.Math.sqrt;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	void findroots(int a,int b, int c)
	{
		if(a==0)
		{
			System.out.println("Invaild");
			return;
		}
		
		int d = b*b - 4*a*c;  
		double sqrt_val = sqrt(d);
		if(d > 0)
		{
			System.out.println("The Root are real and different");
			System.out.println((double)(-b + sqrt_val) / (2*a)+"\n"+
       					   	   (double)(-b - sqrt_val) / (2*a));
		}	
		else
		{
			System.out.println("Roots are complex \n"); 
	        System.out.println( -(double)b / ( 2 * a ) +"+i"+sqrt_val +"\n"+
	        					-(double)b / ( 2 * a ) +"-i"+sqrt_val);
		}
	}
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the The values of a,b and c");
		int num1=utility.inputInteger();
		int num2=utility.inputInteger();
		int num3=utility.inputInteger();
		
		Quadratic q1=new Quadratic();
		q1.findroots(num1,num2,num3);

	}

}
