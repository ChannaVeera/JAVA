package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class SumOf3Numbers
{
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Enter N value");
		int n=Utility.getnumber();
		Utility.sumOf(n);
		}
		catch (Exception e)
		{
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
