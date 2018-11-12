package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Utility utility=new Utility();
        String str1;
        String str2;
        System.out.print("Enter First String : ");
        str1 = utility.inputString();
        System.out.print("Enter Second String : ");
        str2 = utility.inputString();
        utility.checkAnagram(str1,str2);
	}

}
