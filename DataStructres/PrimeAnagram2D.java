package com.BridgeIt.DataStructres;

import com.BridgeIt.util.Utility;

public class PrimeAnagram2D 
{

	/**
	 * @param args : It takes string array as command line aruguments
	 */
	public static void main(String[] args)

	{

		int[] arr = Utility.prime();
		System.out.print(2 + " ");
		int[][] arr1 = new int[10][167];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 167; j++) {
				if (arr[j] > ((i) * 100) && arr[j] < ((i + 1) * 100)) {

					arr1[i][j] = arr[j];
					System.out.print(arr1[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

}