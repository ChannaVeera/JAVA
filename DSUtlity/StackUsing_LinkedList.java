package com.BridgeIt.DSUtlity;

/******************************************************************************************
 * @purpose : To hold common methods of stackusinglinkedlist class
 * 
 * @author : NK.CHANNAVEERA
 * @version : 1.0
 * @since : 22-03-2019
 ******************************************************************************************/

public class StackUsing_LinkedList<T> {
	private class Node {
		T data;
		Node ref;
	}

	Node top;
	int size;

	@SuppressWarnings("unused")

	/**
	 * @param int :it takes integer as command line aruguments
	 * @purpose : This method is used to push integer values to object
	 * @return : void
	 **/
	public void push(T data) {
		Node node = new Node(); // creating object to node class
		size++;
		if (node == null) // checking wheather node is empty or not
		{
			System.out.print("stack overflow");
			return;
		}
		node.data = data; // storing data
		node.ref = top;// changing reference value
		top = node; // changing top node
	}

	/**
	 * @return
	 * @purpose : This method is used to pop integer element at top of object
	 * @return : void
	 **/
	public T pop() {
		if (top == null) // checking wheather top is null or not
		{
			System.out.print("stack underflow");
			return null;
		}
		T data = top.data;
		top = (top).ref; // changing reference value
		return data;
	}

	/**
	 * @purpose : This method is used to diplay element in object
	 * @return : void
	 **/
	public void display() {
		if (top == null) // checking wheather top is empty or not
		{
			System.out.print("stack overflow");
			System.exit(0);
		} else {
			Node temp = top; // coping top to temp variable
			while (temp != null) {
				System.out.println(temp.data); // printing data
				temp = temp.ref; // changing reference value
			}

		}
	}

	/**
	 * @purpose : This method is used to return size of object
	 * @return : void
	 **/
	public int size() {
		return size;
	}
}
