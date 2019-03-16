package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class Perumetation 
{
	public static void main(String[] args)
	{
		try {
		String Combi= Utility.getStringName();
		int currentindex=0;
		Utility.perumetation(Combi.toCharArray(), currentindex);
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
		

	}
	
}
