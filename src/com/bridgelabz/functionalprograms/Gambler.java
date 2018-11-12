package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler 
{
	public static void main(String[] args)
	{
		Utility utility =new Utility();
		System.out.println("Enter how much money the player have");
		int stake=utility.inputInteger();
		System.out.println("Enter the goal value,which the player needs to make for the final winnig");
		int goal=utility.inputInteger();
		System.out.println("Enter the number of chances the player have");
		int chance=utility.inputInteger();
		Utility.calWinLossInGambling(stake,goal,chance);
	}
}