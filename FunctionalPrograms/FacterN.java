package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class FacterN 
{

public static void main (String[] args) 
{ 
	try 
	{
	System.out.println("enter valid number.....!");
	int n =Utility.getnumber(); 
    Utility.primeFactors(n);
	}
	catch (Exception e)
	{
		// TODO: handle exception
		System.out.println(e);
	}
	
} 

	
}
