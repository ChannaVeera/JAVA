package com.BridgeIt.AlgorithmPrograms;



import com.BridgeIt.util.Utility;

public class SortingAlgo 
{
	public static void main(String[] args)
	{
			System.out.println(" Enter 1 to InsertionSortIntegers");
			System.out.println("Enter 2 to insertionString "); 
			System.out.println("Enter 3 binarySearch"); 
			System.out.println("Enter 4 Binarysearchofstring"); 
			System.out.println("Enter 5 binarySearch"); 
			System.out.println("Enter 6 bubbleSortOfInteger"); 
			System.out.println("Enter 7 bubbleSortOfString"); 
			try {
		int i = Utility.getnumber();
		
		switch(i)
		{
		
		default:System.out.println("enter only present over ther ");
				break;
		case 1: Utility.insertionSort();
				break;
		case 2: Utility.insertionString();
				break;
		case 3: Utility.binarySearch();
				break;
		case 4: Utility.Binarysearchofstring();
				break;
		case 5: Utility.binarySearch();
				break;
		case 6: Utility.bubbleSortOfInteger();
				break;
		case 7: Utility.bubbleSortOfString();
		}
			}catch (Exception e) {
				// TODO: handle exception
			}
			
	}

}
