package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class Array2D 
{
	public static void main(String[] args)
	{
		try 
		{
		System.out.println("Enter Row");
		int row =Utility.getnumber();
		System.out.println("Enter Coloumn");
		int column=Utility.getnumber();
		Utility.array2D(row, column);
		}
		catch (Exception e) 
		{
			System.out.println(e);	// TODO: handle exception
		}
	}

}
