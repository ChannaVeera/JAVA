package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		try {
		System.out.println("Enter $digit number1");
		int n=Utility.getnumber();
		Utility.PrimeNUmber(n);
		
		}
		catch (Exception e) 
		{
		System.out.println(e);// TODO: handle exception
		}
	}
}
