package com.BridgeIt.DataStructres;

public class Queue 
{
	int size;
	int front;
	int rare;
	String arr[];
	int arrSize;
	 public Queue(int arrSize)
	 {
		  this.arrSize=arrSize;
	 }
	 public void enqueue(String data)
	 {
		 arr[rare]=data;//adding value to rare
		 rare=rare+1;
		 size=size+1;
	 }
	 
	 public int size()
	 {
		 return size;
	 }
	 public void deQueue()
	 {
		  String temp = arr[front];// changing position to remove element
		  front++;// front has to be changed sequently coz of FIFO
		  size--;
	 }
	 public void show()
	   {
		   /*for loop to display all elements in queue*/
		   for (int i=0;i<size;i++)
		   {
			   System.out.print(arr[front+i]+" ");
		   }
		   System.out.println();
	   }

}
