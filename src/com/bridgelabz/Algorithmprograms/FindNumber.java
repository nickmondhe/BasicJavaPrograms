package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int[] array =new int[5];
		System.out.println("Please Enter the number list :");
		for(int i=0;i<5;i++)
		{
			array[i]=utility.inputInteger();
		}		
		System.out.println("Enter the key to find :");
		int key=utility.inputInteger();
		int last=array.length-1;  
        utility.binarySearchInteger(array,0,last,key);
	}

}
