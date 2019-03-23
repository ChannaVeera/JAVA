package com.BridgeIt.DataStructres;
/******************************************************************************************
 * 	@purpose      :  To print prime anagram numbers between 1-1000 in a 2D array,1-100 first row,100-200 second row and so on
 *  
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 20-01-2019
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class Prime2D {

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