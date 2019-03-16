package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		try 
		{
			int power=Utility.getnumber();
			Utility.power(power);
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
		
	
		
	}

}
