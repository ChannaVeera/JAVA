package com.BridgeIt.DataStructres;
/******************************************************************************************
* 	@purpose      :  To find given VAlue is  Anagram or not using queue
*  
*  @author       : NK.CHANNAVEERA
*  @version      : 1.0
*  @since        : 23-03-2019
******************************************************************************************/

import com.BridgeIt.DSUtlity.Queue;
import com.BridgeIt.util.Utility;

public class AnagramQueue {

	public static void main(String[] args) {

		Queue a = new Queue(158);
		int i;
		String string = " ";
		String string1 = " ";
		String addvalueTOString = " ";
		String[] strArry = new String[167];

		int arr[] = Utility.prime();

		String[] sttringArray = new String[arr.length];
		StringBuffer stringBuffer = new StringBuffer(arr.length);

		for (i = 0; i < arr.length; i++) {
			addvalueTOString = stringBuffer.append(arr[i] + " ").toString();
		}

		sttringArray = addvalueTOString.split(" ");

		System.out.println("Prime Anagram");
		for (i = 0; i < sttringArray.length - 1; i++) {
			for (int j = i + 1; j < sttringArray.length - 1; j++) {
				string = sttringArray[i].toString();
				string1 = sttringArray[j].toString();
				boolean status = Utility.isAnagram(string, string1);

				if (status) {
					System.out.print("  " + sttringArray[j]);
					a.enQueue(sttringArray[i]);
					a.enQueue(sttringArray[j]);

				}

			}

		}
		System.out.println();
	}
}