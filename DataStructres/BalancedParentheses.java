package com.BridgeIt.DataStructres;
/******************************************************************************************
* 	@purpose      :  To find given Arithmetic Expression is  balanced or not
*  
*  @author       : NK.CHANNAVEERA
*  @version      : 1.0
*  @since        : 19-03-2019
******************************************************************************************/

import com.BridgeIt.DSUtlity.Stack;
import com.BridgeIt.util.Utility;

public class BalancedParentheses {
	public static void main(String[] args) {
		char search;
		Stack<Character> stack = new Stack<Character>();// creating Obj of Stack
		System.out.println("Enter Expression ");
		String expression = Utility.getStringName();
		/* for loop is used to push and pop the parenthesis */
		for (int i = 0; i < expression.length(); i++) {
			search = expression.charAt(i);// picking one on one element
			if (search == '(' || search == '[' || search == '{') {
				stack.push(search);// pushing the element to stack object
			} else if (search == ')' || search == ']' || search == '}') {
				stack.pop();// removing the element from stack object
			}
		}
		if (stack.isEmpty() == true) // condition to check stack object is empty or not
		{
			System.out.println("Arithmetic Expression balanced");
		} else {
			System.out.println("Arithmetic Expression not balanced");
		}

	}
}
