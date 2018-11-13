package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int[] num =new int[5];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<5;i++)
		{
			num[i]=utility.inputInteger();
		}
		System.out.println("The Given array is :");
		Utility.printArray(num);
		utility.sort(num, 0, num.length-1);
		System.out.println("\nThe Sorted array is :"); 
        Utility.printArray(num); 
	}
}
