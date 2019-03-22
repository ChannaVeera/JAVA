package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To find wheather the given year is leap year or not
 *  
 *  @author       :  NK.CHANNAVEERA
 *  @version      : 1.0

 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class LeapYear
{
	
	public static void main(String[] args) 
	{
		try {
		System.out.println("Enter year to check");
		String year=Utility.getStringName();
		Utility.year(year);
		}
		catch (Exception e)
		{
			System.out.println(e);
			// TODO: handle exception
		}
		
	}
}

		

		
	
	

