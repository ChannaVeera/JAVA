package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class ToBinary {
	public static void main(String[] args) {
		toBinary();
	}

	public static void toBinary() {
		System.out.println("enter the value of decimal");
		int number = Utility.getnumber();

		int temp = number;
		int rem;
		String result = "";

		int decimal = 0;

		while (number >= 1) {
			rem = number % 2;
			result = rem + result;// Storing the result in the string *
			number = number / 2;
		}
		System.out.println(" binary value of " + temp + " is " + result);
		int index = 0;
		for (int i = result.length() - 1; i >= 0; i--) {
			char output = result.charAt(index);
			index++;
			int convertedNumber = Character.getNumericValue(output);
			decimal = (int) (convertedNumber * (Math.pow(2, i) + decimal));

		}
		if (temp == decimal) {
			System.out.println(decimal + "decimal and binary numbers are equal" + temp);
		} else {
			System.out.println(decimal + "decimal and binary numbers are not equal" + temp);
		}
	}

}
