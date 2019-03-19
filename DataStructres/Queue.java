package com.BridgeIt.DataStructres;

public class Queue
{

	int size;
	int front;
	int rear;
	String arry[] ;
	int arrSize;
   /*calling constructor to intialize array size*/
	public Queue(int arrSize)
	{
		this.arrSize = arrSize; // globalizing array size
		 arry = new String [arrSize];
	}
	

   public void enQueue(String data)
    {
	   arry[rear] = data; // adding data to rear element
	   rear++; // changing rear position 
	   size++; // incrementing size
	   
   }
   
  
   public int size()
   {
	   return size; // returns the size of array
   }
   
   public void deQueue()
   {
	  String temp = arry[front];// changing position to remove element
	  front++;
	  size--;
	   
   }
   public void show()
   {
	   /*for loop to display all elements in queue*/
	   for (int i=0;i<size;i++)
	   {
		   System.out.print(arry[front+i]+" ");
	   }
	   System.out.println();
   }
}
