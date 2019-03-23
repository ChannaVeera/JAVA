package com.BridgeIt.DSUtlity;

/******************************************************************************************
 * @purpose : To hold all the method of stack
 * 
 * @author : NK.CHANNAVEERA
 * @version : 1.0
 * @since : 19-03-2019
 ******************************************************************************************/

public class Stack<T> {
	Node top;

	public class Node {
		T data;
		Node next;

	}

	/**
	 * @param char :it takes character as command line aruguments
	 * @purpose : This method is used to push character values to object
	 * @return : void
	 ***/
	public void push(T ch) {
		Node node = new Node(); // creating object to node class
		node.data = ch; // adding data
		node.next = top;
		top = node;
	}

	/**
	 * @purpose : This method is used to display the elements in object
	 * @return : void
	 ***/
	public void peek()

	{
		if (top == null) {
			System.out.println("stack is empty");
		} else {
			Node n = top; // assigning top value to n
			while (n.next != null) {
				System.out.println(n.data); // printing data
				n = n.next; // changing reference value
			}
			System.out.println(n.data); // printing last element
		}

	}

	/**
	 * @purpose : This method is used to check wheather stack is empty or not
	 * @return : boolean
	 ***/
	public boolean isEmpty()

	{

		if (top == null) // condition to check wheather stack is empty or not
		{
			return true;
		}
		return false;
	}

	/**
	 * @purpose : This method is used to pop the value from object
	 * @return : void
	 ***/
	public void pop() {
		if (top == null) // checking condition wheather top is null are not
		{
			System.out.println("Arithmetic  Expression is not balanced");
			System.exit(0);

		}

		top = top.next; // changing reference value
	}

}
