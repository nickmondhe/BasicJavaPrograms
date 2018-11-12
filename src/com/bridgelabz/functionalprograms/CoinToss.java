package com.bridgelabz.functionalprograms;

import java.util.Random;

public class CoinToss 
{
	private enum Coin{Heads, Tails};
	Random randomNum = new Random();
	private int result;

	Coin coinFlip;

	public void flip()
	{
		result = randomNum.nextInt(2);

		if(result == 0)
		{
		   coinFlip = Coin.Heads;
		   System.out.println("You flipped Heads!");
		}
		else
		{
		   coinFlip = Coin.Tails;
		   System.out.println("You flipped Tails!");
		}
	}
}
