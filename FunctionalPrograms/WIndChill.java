package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      : To find the Wind Speed 
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class WIndChill {
	public static void main(String[] args) {
		/*
		 * Note: the formula is not valid if t is larger than 50 in absolute value or if
		 * v is larger than 120 or less than 3 (you may assume that the values you get
		 * are in that range).
		 */
		try {
			System.out.println("Enter Temp ");
			double temp = Utility.getDouble();
			System.out.println("Enter Windspped");
			double windspeed = Utility.getDouble();

			if (temp <= 50 && windspeed > 120 || windspeed < 3) {

				double Wind = Utility.windchil(temp, windspeed);
				System.out.println(temp);
				System.out.println(windspeed);
				System.out.println(Wind);

			} else {
				System.out.println("u cant  calucalte .....since the formula is not valid if t is larger than 50 in \n"
						+ "	 * absolute value or if v is larger than 120 or less than 3  ");
			}
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

	}
}
