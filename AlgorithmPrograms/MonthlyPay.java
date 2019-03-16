package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class MonthlyPay
{
	public static void main(String[] args) 
	{
		try 
		{
		System.out.println("enter principle loan amount");
		double P = Utility.getDouble();
		System.out.println("enter no of years ");
		double Y =Utility.getDouble();
		System.out.println("enter rate of interest ");
		double R = Utility.getDouble();
	
		// calling metod to return monthly payable amount
		System.out.println("monthly payment = "+Utility.monthlyPayment(P, Y, R));
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}
		}

}
