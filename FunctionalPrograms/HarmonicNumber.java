package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To find the n th harmonic number and print it
 *  
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 ******************************************************************************************/

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
