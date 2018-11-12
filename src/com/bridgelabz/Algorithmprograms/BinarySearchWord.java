package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) {
		Utility utility=new Utility();
		String [] words = new String[5];
		for(int i=0; i<5; i++) 
		{
			System.out.print("words["+i+"]: ");
			words[i] = utility.inputString();
		}
		System.out.print("Enter word to search for: ");
		String word = utility.inputString();

		int index =utility.binarysearchWord(word, words, 0, words.length);
		if(index < 0) {
			System.out.println("not found");
		} else {
			System.out.println("found at index " + index);
		}

	}

}
