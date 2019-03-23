package com.BridgeIt.AlgorithmPrograms;

/******************************************************************************************
 * 	@purpose      :  To Find give String is anagram or not 
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter cahr squence");
		String s1 = Utility.getStringName();

		System.out.println("Enter cahr squence");
		String s2 = Utility.getStringName();

		Utility.anagram(s1, s2);

	}

}
