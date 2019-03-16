package com.BridgeIt.FunctionalPrograms;



import com.BridgeIt.util.Utility;

public class Gambler 
{
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Enter Stack value");
		int stack=Utility.getnumber();
		System.out.println("Enter goal value");
		int goal=Utility.getnumber();
		System.out.println("Enter times value");
		int times=Utility.getnumber();
		Utility.gamblerpro(stack, goal, times);
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("integer value ");
			// TODO: handle exception
		}
	
	}

}
