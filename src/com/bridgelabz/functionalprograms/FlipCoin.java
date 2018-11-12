package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class FlipCoin{
		public static void main(String[] args) 
		{
			CoinToss test = new CoinToss();
			int choice;	   
			System.out.println("Welcome to the coin flip game!");

			do
			{
				System.out.println("Enter '1' to Flip Coin OR Enter '0' to Quit: ");
				Utility utility=new Utility();
				choice = utility.inputInteger();

				if (choice == 1)
				{
					test.flip();
				}
				else if (choice > 1)
				{
					System.out.println("Invalid entry - please enter 1 or 0: ");
					choice = utility.inputInteger();
				}
			}
		while (choice != 0);
		}
	}

