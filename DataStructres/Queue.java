package com.BridgeIt.DataStructres;
/******************************************************************************************
 * 	@purpose      :  To hold all the method of queue class 
 *  
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 19-03-2019
 ******************************************************************************************/

public class Queue<T>
{


	int size;
	int front;
	int rear;
	T arr[] ;
	int arrSize;
   /*calling constructor to intialize array size*/
	public Queue(int arrSize)
	
	{
		this.arrSize = arrSize; // globalizing array size
		 arr = (T[]) new String [arrSize];
	}
	
/**
 * @param string  : It takes string   as command line arguments 
 * @purpose     : To add a string  element to object at front
 * @return      : void 
 */
   public void enQueue(T data)
  {	
	   arr[rear] = data; // adding data to rear element
	   rear++; // changing rear position 
	   size++; // incrementing size
	   
   }
   
  /**
   * @purpose     : to find no of elements in object
   * @return      : int 
   */
   public int size()
   {
	   return size; // returns the size of array
   }
   
   /**
    * @purpose     : To remove element
    * @return      : void 
    */
   public void deQueue()
   {
	  @SuppressWarnings("unused")
	T temp = arr[front];// changing position to remove element
	  front++;
	  size--;
	   
   }
   
  /**
   * @purpose     : To display the elements in queue
   * @return      : void 
   */
   
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
