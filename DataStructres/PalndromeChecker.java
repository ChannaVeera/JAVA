package com.BridgeIt.DataStructres;

import com.BridgeIt.DSUtlity.Deque;
import com.BridgeIt.util.Utility;

/******************************************************************************************
 * @purpose : To check wheather given string is palindrome or not using deque
 *          class
 * 
 * @author : NK.CHANNAVEERA
 * @version : 1.0
 * @since : 20-03-2019
 ******************************************************************************************/

public class PalndromeChecker {
	/**
	 * @param args : it takes string array as command line arguments
	 */

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String tempVarible = "";
		System.out.println("Enter Word to check");
		String word = Utility.getNextLine();// calling getString() method to scan a word from user

		Deque deque = new Deque(word.length());
		for (int i = 0; i < word.length(); i++) {
			char tmp = word.charAt(i);
			System.out.println(tmp);
			deque.addRear(word.charAt(i));// adding character to rear position of deque
		}
		for (int k = 0; k < word.length(); k++) {
			tempVarible = tempVarible + deque.getFront();
		}
		if (word.equals(tempVarible)) // condition to check string is palindrome or not
		{
			System.out.println("word is palindrome");
		} else {
			System.out.println("word is not palindrome");

		}

	}

}
