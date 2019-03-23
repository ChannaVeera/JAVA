package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class Temperature {
	public static void main(String[] args) {
		try {
			System.out.println("choose 1 to CelsiusToFahrenheit");
			System.out.println("Choose 2 to FahrenheitToCelsius");
			int i = Utility.getnumber();
			Utility.temp(i);
		} catch (Exception e) {
			System.out.println(e); // TODO: handle exception
		}
	}
}
