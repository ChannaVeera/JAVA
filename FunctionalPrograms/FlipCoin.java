package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To find the win percentage and loss percentage when a coin is flipped n times
 *  
 *  @author       :  NK.CHANNAVEERA
 *  @version      : 1.0

 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		try {
			System.out.println("enter number of times to flip");
			int numberOfFlips = Utility.getnumber();
			Utility.flip(numberOfFlips);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}

}
