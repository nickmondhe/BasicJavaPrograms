package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int[] num =new int[5];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<5;i++)
		{
			num[i]=utility.inputInteger();
		}
		System.out.println("The sorted list using Bubble sort is:");
		for(int i=0;i<5;i++)
		{
			utility.bubbleSort(num);
			System.out.println(num[i]);
		}
	}
}
