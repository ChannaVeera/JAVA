package com.BridgeIt.DataStructres;

public class Stack<T> 
{
	Node top;
	
	public class Node
	{
		T data;
		Node next;
		
	}
	public void push(T data)
	{
		Node node =new Node();// creating object to node class
		node.data=data;// adding data
		node.next = top; 
		top = node;// assinging top
	}
	
	public boolean isEmpty()
	{
		if(top== null)// condition to check wheather stack is empty or not
		{
			return true;
			
		}
		return false;
		
	}
	public void display()
	{
		if(top==null)
		{
			System.out.println(" Oops your stack is fulld");
		}
		else
		{
			Node node =top;// assigning top value to n
			while(node.next!=null)// last element or node will not be excuted it consist of null value
			{
				System.out.println(node.data);// printing data
				node= node.next;// changing reference value
			}
			System.out.println(node.data);// printing last element
		}
	}
	public void pop()
	{
		if (top==null) // checking condition wheather top is null are not
		{
			System.out.println("Arithmetic  Expression is not balanced");
			System.exit(0);
		}
		top= top.next; // changing reference value
	}
}
