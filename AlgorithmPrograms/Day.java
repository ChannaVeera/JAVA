package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class Day {

	public static void main(String[] args) {
		try {
			System.out.println("enter day");
			@SuppressWarnings("unused")
			int day = Utility.getnumber();
			System.out.println("enter month");
			int month = Utility.getnumber();
			System.out.println("enter year");
			int year = Utility.getnumber();
			Utility.getDay(month, 1, year);// calling method to find the day
		} catch (Exception e) {
			System.out.println(e); // TODO: handle exception
		}

	}

}
