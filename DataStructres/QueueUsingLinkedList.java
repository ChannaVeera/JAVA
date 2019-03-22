package com.BridgeIt.DataStructres;

/******************************************************************************************
 * 	@purpose      :  To hold common functions of queue using linkedlist class
 *  
 *  @author       :  NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************/

public class QueueUsingLinkedList<T>

{
	/* inner class to declear a node variables*/
	private class Node
	{
		T data;
		Node ref;
	}
	int size;
	Node head;
	Node front;
	Node rear;
	
/**
 * @param integer  : It takes integer value  as command line arguments 
 * @purpose        : To insert elements to object 
 * @return         : void 
 */	
	public void insert(T data)
	{
		Node node = new Node();// creating object to node inner class
		node.data = data; // storing data to data variable
		size++;
		if (rear == null)
		{
			front = node;// making node as front
			rear = node; // making node as rear
		}
		rear.ref = node;// changing reference value
		rear = node;// changing rear
		
	
	}
/**
 * @purpose        : To display elements to object 
 * @return         : void 
 */		
	public void display()
	{
		Node temp = front; 
		while (temp.ref!=null) // condition to print elements
		{
			System.out.print(temp.data+ "  ");
			temp = temp.ref; // changing reference value
		}
		System.out.print(temp.data+"  "); // printing last data element
		System.out.println();
	}
	
/**
 * @purpose        : To remove elements from front of object 
 * @return         : void 
 */		
	public  T remove()
	{
		if(front == null) // checking front is null or nor
		{
			return null;
		}
		else
		{
			T data = front.data;
		  front = front.ref;// changing reference value
		  return data;
		}
		
	}
	
	
/**
 * @purpose        : To return no of elements in object 
 * @return         : int
 */			
	
	public  int size()
	{
		return size;// returning size
	}
	
	
	
	
	
}