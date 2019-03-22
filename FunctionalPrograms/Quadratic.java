package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To find roots of a given equation
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class Quadratic 
{
	public static void main(String[] args) 
	{	
		try 
		{
		System.out.println("Enter 'a' value ");
		int a=Utility.getnumber();
		System.out.println("Enter 'b' value");
		int b=Utility.getnumber();
		System.out.println("Enter 'C' value");
		int c =Utility.getnumber();
		Utility.quadratic(a, b, c);
	}
	catch (Exception e) 
	{
		System.out.println(e);// TODO: handle exception
	}
	}

}
