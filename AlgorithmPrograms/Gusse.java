package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class Gusse
{
	public static void main(String[] args) 
	{
		try {
		int num = 0;
		if (args.length<1)
		{
			System.out.println("provide Commend line Argument");
			return;
		}
		num=Integer.parseInt(args[0]);
		int[] arry = new int [num];
		for (int i=0;i<arry.length;i++)
		{
			arry[i]=i;
		}
		
		System.out.println("Select the value range 0 to "+(num-1));
		char chocie;
		do
		{
		
			System.out.println("Have you assumed a number..........?");
			System.out.println("Answer please y/n");
			chocie= Utility.getStringName().toLowerCase().charAt(0);
		}
		while(chocie!='y');
		Utility.guess(arry, 0, num-1);
			
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
	}

}
