package com.BridgeIt.DataStructres;

import com.BridgeIt.DSUtlity.Deque;
import com.BridgeIt.DSUtlity.Dequeue;
import com.BridgeIt.util.Utility;

/******************************************************************************************
 * @purpose : To check wheather given string is palindrome or not using deque
 *          class
 * 
 * @author : NK.CHANNAVEERA
 * @version : 1.0
 * @since : 20-03-2019
 ******************************************************************************************/

public class PolindromeCheck {

	public static Dequeue queue = new Dequeue();

	public static void main(String[] args) {
		
		System.out.println("Enter the String to check palindrome are not");
		String input = Utility.getNextLine();

		char[] charA = input.toCharArray();

		for (int i = 0; i < charA.length; i++) {
			queue.addRear(Character.toString(charA[i]));
		}
		String reverse = "";

		int length = queue.size();
		for (int i = 0; i < length; i++) {
			reverse = reverse + queue.removeRear();
		}

		if (input.compareTo(reverse) == 0) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the string is not a palindrome");
		}
	}

}