package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class VindingMachine {
	public static void main(String[] args)

	{
		try {
			System.out.println("enter the amount to withdraw");
			int amount = Utility.getnumber();
			Utility.vendingMachine(amount);// calling method to print number of notes
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}
}
