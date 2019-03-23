package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class CoupenNumber {
	public static void main(String[] args) {
		try {
			System.out.println("enter distent ");
			int n = Utility.getnumber();
			Utility.coupenNUm(n);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}
}
