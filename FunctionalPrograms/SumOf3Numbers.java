package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To get values of sum of three integers 
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class SumOf3Numbers {
	public static void main(String[] args) {
		try {
			System.out.println("Enter N value");
			int n = Utility.getnumber();
			Utility.sumOf(n);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
