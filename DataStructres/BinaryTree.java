package com.BridgeIt.DataStructres;
/****************************************************************************************************
 * 	@purpose      :  To find number of posibilities of a given number 
 *  
 *  @author       :NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 21-03-2019
 ******************************************************************************************************/

import com.BridgeIt.util.Utility;

public class BinaryTree {

	static long fact1 = 1;
	static long fact2 = 1;
	static long fact3 = 1;

	public static long factorial(long n) {

		for (int i = 1; i <= n; i++) {
			fact1 = i * fact1;
		}
		// System.out.println(fact1);
		return fact1;
	}

	public static long factorial1(long n) {
		long n2 = 2 * n;
		for (int i = 1; i <= n2; i++) {
			fact2 = i * fact2;
		}
		return fact2;
	}
	
	public static long factoria12(long n) {
		long n1 = n + 1;
		for (int i = 1; i <= n1; i++) {
			fact3 = i * fact3;
		}
		return fact3;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number");
		int n = Utility.getnumber();
		long tree = ((factorial1(n)) / (factoria12(n) * factorial(n)));
		System.out.println(tree + ":number of nodes in tree for =>" + n);

	}

}
