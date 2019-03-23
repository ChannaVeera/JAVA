package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class Rooteelipson {
	public static void main(String[] args) {
		try {
			System.out.println("Enter value");
			int c = Utility.getnumber();
			Utility.squarertnon(c);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}

}
