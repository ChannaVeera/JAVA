package com.BridgeIt.DataStructres;

public class LinkedListInt
{
	Node head;
	int data;
 	static class Node
 	{
 		Node next;
 		int data;
 	
 		
 	}
 	public void add(int data) 
 	{
 		Node node = new Node();
 		node.data=data;
 		node.next=null;
 		if(head== null)
 		{
 			head=node;
 			
 		}
 		else
 		{
 			Node nodee = new Node();
 			while(nodee.next!=null)
 			{
 				nodee=nodee.next;
 				
 			}
 			nodee.next=node;
 			
 		}
	}
 	public void display()
 	{
 		Node node = new Node();
  		while(node.next!=null)
  		{
  			System.out.println(node.data);
  			node=node.next;
  			
  		}
  		System.out.println(node.data);
  		
 	}
 		public void insertAt(int index ,int data)
 	{
 		Node node= new Node();
 		node.data= data;
 		node.next= null;
  		Node n = head;
 		for(int i=0;i<index;i++)
 		{
 			n=n.next;
 			
 		}
 		node.next=n.next;
 		n.next=node;
 	} 	
 	

 	public void deletAt(int index)
 	{
 		if(index==0)
 		{
 			head=head.next;
 			
 		}
 		else
 		{
 			Node n = new Node();
 			Node n1=null;
 			for(int i=0;i<index;i++) {
 				n=n.next;
 				
 			}
 			n1=n.next;
 			n.next=n1.next;
 			System.out.println("node"+n1.data);
 		}
 	}
 	
 


}
