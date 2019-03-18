package com.BridgeIt.DataStructres;

import com.BridgeIt.util.Utility;

public class BalancedParentheses 
{
	public static void main(String[] args) 
	{
		char search;
		Stack<Character> stack=new Stack<Character>();// creating Obj of Stack
		System.out.println("Enter Expression ");
		String expression =Utility.getStringName();
		/*for loop is used  to push  and pop the parenthesis*/
		for(int i =0 ;i<expression.length();i++)
		{
			search=expression.charAt(i);// picking one on one element
			if(search=='(')
			{
				stack.push(search);// pushing the element to stack object 
			}
			else if (search ==')')
			{
				stack.pop();// removing the element from stack object
			}
		}
		if (stack.isEmpty()== true) // condition to check stack object is empty or not
		{
			System.out.println("Arithmetic Expression balanced");
		}
		else
		{
			System.out.println("Arithmetic Expression not balanced");
}
		
	}
}
