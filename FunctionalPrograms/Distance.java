package com.BridgeIt.FunctionalPrograms;



import com.BridgeIt.util.Utility;

public class Distance
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(" enter the value of a ");
			double a=Utility.getranDouble();
			System.out.println(" enter the value of b ");
			double b=Utility.getranDouble();
			double distance = Utility.dist(a, b);
			System.out.println("distance between  point(a,b) and origin is" +distance  );
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
		
	}

}
