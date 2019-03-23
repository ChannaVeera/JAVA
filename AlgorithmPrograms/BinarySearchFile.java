package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;

public class BinarySearchFile {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Enter a word from files");
			String word = Utility.getStringName();
			if (Utility.binarysearchFile(word) == true) {
				System.out.println("Element found ");
			} else {
				System.out.println("not fount");
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}
}
