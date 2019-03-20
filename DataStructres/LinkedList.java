package com.BridgeIt.DataStructres;
/******************************************************************************************
 * 	@purpose      :  To hold all the method of linkedlist 
 *  
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 18-03-2019
 ******************************************************************************************/


public class LinkedList<T>//T stands for generic 
{
	Node head; // declearing head node 
	public class Node 
	{
		T data;
		Node next;
	}

	/**
	 * @parm T       : It takes generic datatype as command line arugument
	 * @purpose      : This  method is used to add String data to a linkedlist
	 * @return       : void
	 **/	
	public  void add(T data)
	{
		Node node = new Node(); // creating nodes
		node.data = data;// adding data
		
		if(head == null)
		{
			head = node;  // make head as a first node
		}
		else 
		{
			Node n = head; 
			
			while (n.next!=null) // take refrence values
			{
				n=n.next; //changing reference values
			}
			n.next = node;
		}
		
	}
	/**
	 * @purpose   : This  method is used to  display the data which is in linkedlist object
	 * @return    : void
	 **/	
					
		public void display()
		{
		 Node n = head; // making n as head node
		 
		while (n.next!=null)
		{
			System.out.print(n.data+" "); // retreving the data
			n = n.next; // changing refrence 
		}
		System.out.println(n.data); // retreving last element
		 
	 }

	 /**
	  * @parm  T        : It takes generic data type as command line arugument
	  * @purpose        : This  method is used to search a specific element in a linkedlist
	  * @return         : boolean
	  **/
	 
	 public boolean search(T word)
	 
	 {
		 Node n = head; // making n as head node
		 
		 while(n.next!=null)// next reference value
		 {
			 if (n.data.equals(word)) // comparing data with user search value
			 {
				 return true;
			 }
			 	 
			 if(n.next==null) // checking last element of object
			 {
				 n.data.equals(word); //comparing data with user search value
				 return true;
			 }
			 n =n.next;
		 }
		 
		return false;
		 
	 }
	 

	 /**
	  * @parm T       : It takes generic data type as command line arugument
	  * @purpose      : This  method is used to delete a specific element in a linkedlist
	  * @return       : void
	  **/	
	 
	 public void delete(T ele)
	
	 {
		 Node n = head;
		Node n1 = head;
		
		if (n.data.equals(ele)) // checking head element with user search element to delete 
		{
			head = head.next; // changing reference value
		}
		while (n!=null)
		{
			 if (n.data.equals(ele)) // checking for the element in list
			{
				n1.next = n.next; // changing reference value
			}
			n1=n;
			n=n.next;
		}
	 }
	 /**
	  * @parm T  : It takes generic data type as command line arugument
	 * @purpose       : This  method is used to add element at first position of linkedlist
	 * @return        : void
	 **/	
	 public void addFirst(T  data)
	 {
		Node node = new Node(); // creating object 
		node.data = data; // adding data to first node
		node.next = head; 
		head = node;
		 
	 }
	 
 
	 /**
	  * @purpose   : This  method is used to covert words in a list to string
	  * @return    : string
	  **/
  
	 public String getString()
	 {
		 String output =" ";
		 Node n = head; // making n as head node
		 
		 while (n.next!=null)
		 {
			output += n.data+" "; // adding all values to output variable
			n =n.next;
		 }
		 output +=n.data; // adding last element
		 return output;
	 }
	 


}
