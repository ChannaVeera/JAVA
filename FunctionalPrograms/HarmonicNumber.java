package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class HarmonicNumber
{
	public static void main(String[] args)
	{
		try {
			
		
		System.out.println("Enter valid number ");
		int  n=Utility.getnumber();
		
		Utility.harmonic(n);
		}
		catch (Exception e)
		{
			System.out.println(e+"Enter valid input");
			// TODO: handle exception
		}
		
	}

}
