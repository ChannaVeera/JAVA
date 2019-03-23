package com.BridgeIt.DataStructres;

import com.BridgeIt.DSUtlity.Queue;
import com.BridgeIt.util.Utility;

public class AnagramQueue {

	public static void main(String[] args) {

		Queue a = new Queue(158);
		int i;
		String str = " ";
		String str1 = " ";
		String add = " ";
		String[] strArry = new String[167];

		int arr[] = Utility.prime();

		String[] strarr = new String[arr.length];
		StringBuffer sb = new StringBuffer(arr.length);

		for (i = 0; i < arr.length; i++) {
			add = sb.append(arr[i] + " ").toString();
		}

		strarr = add.split(" ");

		System.out.println("Prime Anagram");
		for (i = 0; i < strarr.length - 1; i++) {
			for (int j = i + 1; j < strarr.length - 1; j++) {
				str = strarr[i].toString();
				str1 = strarr[j].toString();
				boolean status = Utility.isAnagram(str, str1);

				if (status) {
					System.out.print("  " + strarr[j]);
					a.enQueue(strarr[i]);
					a.enQueue(strarr[j]);

				}

			}

		}
		System.out.println();
	}
}