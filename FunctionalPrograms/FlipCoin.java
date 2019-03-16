package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class FlipCoin 
{
	public static void main(String[] args)
	{
		try {
		System.out.println("enter number of times to flip");
		int numberOfFlips=Utility.getnumber();
		Utility.flip(numberOfFlips);
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
	}

}
