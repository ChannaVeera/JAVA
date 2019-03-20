package com.BridgeIt.DataStructres;

import com.BridgeIt.util.Utility;

public class PrimeAnagramUsingQUEUE 
{
	public static void main(String[] args) 
	{ 
		//creating object for queueusinglinkedlist class
		QueueUsingLinkedList<Integer> qll = new QueueUsingLinkedList<Integer>();
		// calling method to store all prime numbers in an array
		final int PRIME[] = Utility.convertToIntegerArray();
		/*for loop to add all prime numbers to object*/
		for (int i=0;i<PRIME.length;i++)
		{
			qll.insert(PRIME[i]); // calling method to insert prime elements in to object
		}
		qll.display(); // calling method to display elements in object

} 

}
