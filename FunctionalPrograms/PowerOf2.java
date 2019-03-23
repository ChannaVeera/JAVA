package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose       :  To find power value of 2 till  n th time
 *  
 *  @author       :NK.CHANNAVEERA
 *  @version      : 1.0
 
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class PowerOf2 {
	public static void main(String[] args) {
		try {
			int power = Utility.getnumber();
			Utility.power(power);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

	}

}
