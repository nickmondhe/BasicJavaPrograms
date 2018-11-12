package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Utility utility=new Utility();
		String[] words = new String[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("words["+i+"]: ");
			words[i]= utility.inputString();
		}
		
		System.out.println("The Sorted List is:");
		for(int i=0;i<5;i++)
		{
			utility.insertionsortWords(words);
			System.out.println(words[i]);
		}
	}

}
