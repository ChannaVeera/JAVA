package com.BridgeIt.DataStructres;
/******************************************************************************************
* 	@purpose      :  To find given VAlue is  Anagram or not using stack
*  
*  @author       : NK.CHANNAVEERA
*  @version      : 1.0
*  @since        : 23-03-2019
******************************************************************************************/

import com.BridgeIt.DSUtlity.Stack_;
import com.BridgeIt.util.Utility;

public class AnagramStack {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stack_ a = new Stack_(158);
		int i;
		String string = " ";
		String string1 = "";
		String addValueTOString = " ";
		String[] str2 = new String[167];
	
		int arr[] = Utility.prime();

//		for(i=0;i<arr.length;i++)
//		{
//			System.out.println(""+arr[i]);
//		}
		String[] strarr = new String[arr.length];
		StringBuffer sb = new StringBuffer(arr.length);

		for (i = 0; i < arr.length; i++) {
			addValueTOString = sb.append(arr[i] + " ").toString();
		}

		strarr = addValueTOString.split(" ");

		System.out.println("Prime Anagram");
		System.out.println(" Push:");
		for (i = 0; i < strarr.length - 1; i++) {
			for (int j = i + 1; j < strarr.length - 1; j++) {
				string = strarr[i].toString();
				string1 = strarr[j].toString();
				boolean status = Utility.isAnagram(string, string1);

				if (status) {
					System.out.print(" " + strarr[j]);
					a.push(strarr[i]);
					a.push(strarr[j]);

				}

			}

		}
		System.out.println();
		System.out.println(" Pop:");
		for (i = 0; i < a.size; i++) {
			a.pop(); // System.out.println(""+s);
		}

	}

}