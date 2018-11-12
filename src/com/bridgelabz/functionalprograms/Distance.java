package com.bridgelabz.functionalprograms;

public class Distance { 
		static double distance(int x1,int y1,int x2,int y2)
		{
			return Math.sqrt(Math.pow(x1-y1,2)+Math.pow(x2-y2,2)*1.0);	
		}
		public static void main(String arg[])
		{
			System.out.println(distance(3,4,4,3));
		}
	}

